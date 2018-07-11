package com.jiuyi.alps.nka.resource.util;

import com.jiuyi.alps.nka.service.util.UtilUploadDownloadService;
import common.rest.RestResponse;
import common.rest.RestResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renpeng
 * @date 2018/6/6
 */
@Api(tags = "util-upload-download-info", description = "上传下载工具使用")
@RestController
public class UtilUploadDownloanResource {

    private Logger logger = LoggerFactory.getLogger(getClass());
    //aliyun的一个url
    public static final String URL_ONE_ALIYUN = "https://xindai.oss-cn-qingdao.aliyuncs.com/nk/contract/loan/nk_loan_2018060610000007-3000772.pdf";


    @Autowired
    private UtilUploadDownloadService utilUploadDownloadService;


//    @ApiOperation("上传工具的使用")
//    @RequestMapping(value = "/util/upload/a", method = RequestMethod.GET)
//    public RestResponse<Void> getUpload() {
//        utilDateService.findDate();
//        int i=utilDateService.getMonthDiff(utilDateService.DATE_10_DATE_STR);
//        utilDateService.getlastDay();
//        utilDateService.getlastDayByFormat();
//        return new RestResponseBuilder<Void>().success(null);
//    }
    @ApiOperation("下载工具的使用")
    @RequestMapping(value = "/util/download/a", method = RequestMethod.GET)
    public RestResponse<Void> getDownload(@RequestParam(value = "filePath") String filePath) {
        byte[] contractByte=null;
        try {
            filePath= URL_ONE_ALIYUN;
            contractByte=utilUploadDownloadService.downloadToByte(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RestResponseBuilder().success(contractByte);
    }
}
