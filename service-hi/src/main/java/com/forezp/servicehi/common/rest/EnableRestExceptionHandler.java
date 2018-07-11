package com.forezp.servicehi.common.rest;

/**
 * Created by WangGang on 2017/3/10.
 */

import com.forezp.servicehi.common.rest.advice.RestExceptionHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(RestExceptionHandler.class)
public @interface EnableRestExceptionHandler {
}
