package common.util.qr;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Map;

/**
 * @author zhangyibo
 */
public class QRCodeUtil {

    private static final Logger LOG = LoggerFactory.getLogger(QRCodeUtil.class);

    private static final String DEFAULT_IMAGE_FORMAT = "jpg";

    /**
     * 生成二维码
     */
    public static void generateQRCode(String filePath, String content, int width, int height) {
        Map<EncodeHintType, Object> hints = Maps.newHashMapWithExpectedSize(1);
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        } catch (WriterException e) {
            LOG.error("二维码生成失败", e);
        }
        String pathPrefix = filePath.substring(0, filePath.lastIndexOf("/"));
        Path path = FileSystems.getDefault().getPath(pathPrefix, new File(filePath).getName());
        try {
            if (!new File(filePath).getParentFile().exists()) {
                Files.createParentDirs(new File(filePath));
            }
            MatrixToImageWriter.writeToPath(bitMatrix, DEFAULT_IMAGE_FORMAT, path);
        } catch (IOException e) {
            LOG.error("二维码生成失败", e);
        }
    }


    /**
     * 去除二维码白边
     * @param matrix
     * @return
     */
    private static BitMatrix deleteWhite(BitMatrix matrix) {
        int[] rec = matrix.getEnclosingRectangle();
        int resWidth = rec[2] + 1;
        int resHeight = rec[3] + 1;

        BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
        resMatrix.clear();
        for (int i = 0; i < resWidth; i++) {
            for (int j = 0; j < resHeight; j++) {
                if (matrix.get(i + rec[0], j + rec[1]))
                    resMatrix.set(i, j);
            }
        }
        return resMatrix;
    }

    public static final void overlapImage(String backImgPath, String frontImgPath, String resultImg, int overPosX, int overPosY) {
        BufferedImage backImg = null;
        BufferedImage frontImg = null;
        try {
            backImg = ImageIO.read(new File(backImgPath));
            frontImg = ImageIO.read(new File(frontImgPath));
        } catch (IOException e) {
            LOG.error("图片读取失败", e);
        }
        Graphics2D g = backImg.createGraphics();
        g.drawImage(frontImg, overPosX, overPosY, frontImg.getWidth(), frontImg.getHeight(), null);
        g.dispose();
        try {
            File resultImgFile = new File(resultImg);
            if (!resultImgFile.getParentFile().exists()) {
                Files.createParentDirs(resultImgFile);
            }
            ImageIO.write(backImg, resultImgFile.getName().split("\\.")[1], resultImgFile);
        } catch (IOException e) {
            LOG.error("图像写入失败", e);
        }
    }

}
