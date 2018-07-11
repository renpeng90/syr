package com.forezp.servicehi.resource.cust;

import com.forezp.servicehi.common.api.error.NkaError;
import com.forezp.servicehi.common.rest.RestResponse;
import com.forezp.servicehi.common.rest.RestResponseBuilder;
import com.forezp.servicehi.common.rest.exception.RestException;
import com.forezp.servicehi.service.UtilStringService;
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
public class CustInfoResource {
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
