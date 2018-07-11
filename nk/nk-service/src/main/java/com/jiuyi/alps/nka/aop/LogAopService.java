package com.jiuyi.alps.nka.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.assertj.core.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 在每个方法调用入口以及出口打印日志
 *
 * @author zhangyibo
 */
@Component
@Aspect
public final class LogAopService {

    private static final Logger LOG = LoggerFactory.getLogger(LogAopService.class);

    private static final int MAX_LOG_LENGTH = 1024;

    @Around(value = "execution(* com.jiuyi.alps.nka.resource..*.*(..))")
    public Object methodAroundLog(ProceedingJoinPoint jp) throws Throwable {

        String paramsStr = "";
        if (jp.getArgs() != null) {
            paramsStr = removeOutOfMaxLengthStr(Arrays.toString(jp.getArgs()));
        }
        LOG.info("{} processing... args={}", jp.getSignature().toString(), paramsStr);

        Object result = jp.proceed();

        String logResult = "";
        if (result != null) {
            logResult = removeOutOfMaxLengthStr(result.toString());
        }
        LOG.info("{} finish rtnResult={}", jp.getSignature().toString(), logResult);
        return result;
    }

    private String removeOutOfMaxLengthStr(String str) {
        if (Strings.isNullOrEmpty(str)) {
            return "";
        }
        if (str.length() > MAX_LOG_LENGTH) {
            return str.substring(0, MAX_LOG_LENGTH);
        }
        return str;
    }

}
