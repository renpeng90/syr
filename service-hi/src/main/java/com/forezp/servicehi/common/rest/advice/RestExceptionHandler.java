package com.forezp.servicehi.common.rest.advice;

import com.forezp.servicehi.common.rest.RestResponse;
import com.forezp.servicehi.common.rest.RestResponseBuilder;
import com.forezp.servicehi.common.rest.error.ServiceError;
import com.forezp.servicehi.common.rest.exception.RestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by WangGang on 2017/2/22.
 */
@ControllerAdvice
public class RestExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler
    @ResponseBody
    public RestResponse handleRestException(HttpServletRequest request, Exception e) {
        logger.error("URI [{}]请求异常", request.getRequestURI(), e);
        if (e instanceof RestException) {
            return new RestResponseBuilder<>().fail(null, ((RestException) e).getErrorCode(), e.getMessage());
        } else if (e instanceof IllegalArgumentException) {
            return new RestResponseBuilder<>().fail(null, ServiceError.SY0105.getCode(), e.getMessage());
        }

        return new RestResponseBuilder<>().fail(null, ServiceError.INTERNAL_ERROR.getCode(), ServiceError.INTERNAL_ERROR.getMessage());

    }
}
