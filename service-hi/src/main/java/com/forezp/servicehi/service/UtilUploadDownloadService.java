package com.forezp.servicehi.service;

import com.forezp.servicehi.common.api.error.NkaError;
import com.forezp.servicehi.common.rest.exception.RestException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author renpeng
 * @date 2018/6/6
 */
@Service
public class UtilUploadDownloadService {

    private Logger logger = LoggerFactory.getLogger(getClass());
    //aliyun的一个url
    public static final String URL_ONE_ALIYUN = "https://xindai.oss-cn-qingdao.aliyuncs.com/nk/contract/loan/nk_loan_2018060610000007-3000772.pdf";





    public String uploadReport(String urlStr, String name, String contractType) {
        logger.info("[上传合同-开始]上传合同到oss：开始执行上传");
        String result = null;
        Map<String, String> fileInfo = new HashMap<>();
        String fileName = "nk/contract/"+contractType+"/nk_"+name+".pdf";
        fileInfo.put("ContentType", "text/plain");
        fileInfo.put("filename", fileName);
        ByteArrayInputStream inputBytesStream = null;
        try {
            //-----//下面是从从网络Url中下载文件变为输入流自己数组
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //设置超时间为3秒
            conn.setConnectTimeout(3*1000);
            //防止屏蔽程序抓取而返回403错误
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //得到输入流
            InputStream inputStream = conn.getInputStream();
            //获取自己数组
            byte[] getData = readInputStream(inputStream);
            //-----//上面是从从网络Url中下载文件变为输入流自己数组
            inputBytesStream = new ByteArrayInputStream(getData);
//            inputStream = new ByteArrayInputStream(report.getBytes("UTF-8"));
            boolean uploadRes =false; //fileClient.uploadFile(inputBytesStream, fileInfo);
            if (!uploadRes) {
                logger.info("上传合同文件失败,name:{},result:{}", name, uploadRes);
                return result;
            }
        } catch (IOException e) {
            logger.error("合同-字符串报告转字节流异常，name:{},e:{}", name, e);
        } finally {
            if (inputBytesStream != null) {
                try {
                    inputBytesStream.close();
                } catch (IOException e) {
                    logger.error("合同-关闭字节流异常，e:{}", e);
                }
            }
        }

        result = fileName;
        logger.info("合同-文件路径为：{},name:{}", fileName,name);
        return result;
    }
    /**
     * 通过URL下载
     * @param filePath
     * @return
     */
    public byte[] downloadToByte(String filePath) {
        if (StringUtils.isBlank(filePath)) {
            return null;
        }
        InputStream inputStream =null;
        OutputStream outputStream =null;
        try {
            //-----//下面是从从网络Url中下载文件变为输入流自己数组
//            URL url = new URL("https://xindai.oss-cn-qingdao.aliyuncs.com/nk/contract/loan/nk_loan_2018060610000007-3000772.pdf");
            URL url = new URL("https://xindai.oss-cn-qingdao.aliyuncs.com/"+filePath);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //设置超时间为3秒
            conn.setConnectTimeout(3*1000);
            //防止屏蔽程序抓取而返回403错误
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //得到输入流
            inputStream = conn.getInputStream();

//            获取自己数组
            byte[] getData = readInputStream(inputStream);
            return getData;
        } catch (Exception e) {
            //当文件不存在时 会抛出该异常
            logger.error("获取合同异常", e);
            throw new RestException(NkaError.INTERNAL_ERROR.getCode(), "filePath=" + filePath + "的合同不存在");
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error("合同-关闭字节流异常，e:{}", e);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    logger.error("合同-关闭字节流异常，e:{}", e);
                }
            }
        }

    }
    /**
     * 从输入流中获取字节数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }

}
