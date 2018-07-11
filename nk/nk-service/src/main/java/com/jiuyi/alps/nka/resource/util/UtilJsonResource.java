package com.jiuyi.alps.nka.resource.util;

import com.jiuyi.alps.nka.service.util.UtilJsonService;
import common.rest.RestResponse;
import common.rest.RestResponseBuilder;
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

}
