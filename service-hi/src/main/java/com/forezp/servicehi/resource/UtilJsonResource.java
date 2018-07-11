package com.forezp.servicehi.resource;

import com.forezp.servicehi.common.rest.RestResponse;
import com.forezp.servicehi.common.rest.RestResponseBuilder;
import com.forezp.servicehi.service.UtilJsonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renpeng
 * @date 2018/6/6
 */
@Api(tags = "util-json-info", description = "json工具使用")
@RestController
public class UtilJsonResource {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UtilJsonService utilJsonService;


    @ApiOperation("json工具的使用")
    @RequestMapping(value = "/util/json", method = RequestMethod.GET)
    public RestResponse<Void> getJson() {
        utilJsonService.findJson();

        return new RestResponseBuilder<Void>().success(null);
    }
    @ApiOperation("从文件中读取json数据")
    @RequestMapping(value = "/util/json/readWithFastJson", method = RequestMethod.GET)
    public RestResponse<Void> getReadWithFastJson() {
        utilJsonService.readWithFastJson();
        return new RestResponseBuilder<Void>().success(null);
    }
    @ApiOperation("解析各种格式的json数据")
    @RequestMapping(value = "/util/json/findJson3", method = RequestMethod.GET)
    public RestResponse<Void> findJson3() {
        utilJsonService.findJson3();
        return new RestResponseBuilder<Void>().success(null);
    }
    @ApiOperation("解析各种格式的json数据(做判断)")
    @RequestMapping(value = "/util/json/findJson3", method = RequestMethod.GET)
    public RestResponse<Void> findJson4() {
        utilJsonService.findJson4();
        return new RestResponseBuilder<Void>().success(null);
    }

}
