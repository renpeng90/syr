package com.forezp.servicehi.resource;

import com.forezp.servicehi.common.rest.RestResponse;
import com.forezp.servicehi.common.rest.RestResponseBuilder;
import com.forezp.servicehi.service.UtilDateService;
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
@Api(tags = "util-date-info", description = "时间工具使用")
@RestController
public class UtilDateResource {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UtilDateService utilDateService;


    @ApiOperation("时间工具的使用")
    @RequestMapping(value = "/util/date", method = RequestMethod.GET)
    public RestResponse<Void> getDate() {
        utilDateService.findDate();
        int i=utilDateService.getMonthDiff(utilDateService.DATE_10_DATE_STR);
        utilDateService.getlastDay();
        utilDateService.getlastDayByFormat();
        return new RestResponseBuilder<Void>().success(null);
    }
}
