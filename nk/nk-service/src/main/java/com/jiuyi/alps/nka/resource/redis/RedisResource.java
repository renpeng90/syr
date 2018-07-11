package com.jiuyi.alps.nka.resource.redis;

import com.jiuyi.alps.nka.service.redis.RedisService;
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

@Api(tags = "redis-info", description = "redis测试")
@RestController
public class RedisResource {

    @Autowired
    private RedisService redisService;


    private static final Logger logger = LoggerFactory.getLogger(RedisResource.class);

    @ApiOperation("reids测试")
    @RequestMapping(value = "/redis/test", method = RequestMethod.GET)
    public RestResponse<Void> redisTest() {
        redisService.testCode();
        return new RestResponseBuilder<>().success(null);
    }






}
