package com.jiuyi.alps.nka.service.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author renpeng
 * @date 2018/7/10
 */
//redis的增删改查
public class RedisService {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final String SMS_CODE_KEY_PREFIX = "sms-code-";
    private static final String SMS_SEND_COUNT_IP_KEY_PREFIX = "sms-cnt-ip-";
    private static final String SMS_BLACK_IP_KEY = "sms-black-ip";
    private static final Integer smsCodeExpireMinute = 30;
    @Autowired
    private StringRedisTemplate redisTemplate;
    private void test(){
        redisTemplate.opsForValue();//操作字符串
        redisTemplate.opsForHash();//操作hash
        redisTemplate.opsForList();//操作list
        redisTemplate.opsForSet();//操作set
        redisTemplate.opsForZSet();//操作有序set

    }

    public void testCode() {
        String mobile="123456789";
        Long ip=Long.valueOf("123456789");
        //发送验证码
        int smsCode = (int) ((Math.random() * 9 + 1) * 100000);
        logger.debug("sms code: mobile {},code {}", mobile, smsCode);

        //记录验证码到redis，设置有效期


        //增加
        redisTemplate.opsForValue().set(SMS_CODE_KEY_PREFIX + mobile, String.valueOf(smsCode));
        //查询
        redisTemplate.opsForValue().get(SMS_CODE_KEY_PREFIX + mobile);
        //设置生存时间
        redisTemplate.expire(SMS_CODE_KEY_PREFIX + mobile, smsCodeExpireMinute, TimeUnit.MINUTES);
        //删除
        redisTemplate.delete(SMS_CODE_KEY_PREFIX + mobile);
        //修改
//        boolean blackIp = redisTemplate.opsForSet().isMember(SMS_BLACK_IP_KEY, String.valueOf(ip));
//        redisTemplate.opsForSet().isMember(SMS_BLACK_IP_KEY, String.valueOf(ip));

//        String sendCountKey = SMS_SEND_COUNT_IP_KEY_PREFIX + ip;
//        Long sendCount = redisTemplate.opsForValue().increment(sendCountKey, 1);
//
//        redisTemplate.opsForSet().add(SMS_BLACK_IP_KEY, String.valueOf(ip));

//
//
//        redisTemplate.opsForHash().putAll(this.getAclCacheKey(moduleId), aclMap);
//
//        Map<Object, Object> acl = stringRedisTemplate.opsForHash().entries(this.getAclCacheKey(moduleId));
    }
}
