package com.jiuyi.alps.nka.resource.util;

import com.jiuyi.alps.nka.error.NkaError;
import com.jiuyi.alps.nka.service.util.UtilStringService;
import common.rest.RestResponse;
import common.rest.RestResponseBuilder;
import common.rest.exception.RestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author renpeng
 * @date 2018/6/6
 */
public class UtilStringResource {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UtilStringService utilStringService;



    @RequestMapping(value = "/util/string/{custId}", method = RequestMethod.GET)
    public RestResponse<String> identNo(@PathVariable(value = "custId") Integer custId) {
        String string=utilStringService.findByCustId(custId);
        if (string == null) {
            logger.error("不存在的客户,custId = {}", custId);
            throw new RestException(NkaError.NND_0301);
        }
        return new RestResponseBuilder<String>().success(string);
    }
}
