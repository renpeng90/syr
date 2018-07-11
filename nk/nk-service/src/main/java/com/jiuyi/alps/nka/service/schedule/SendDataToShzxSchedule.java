package com.jiuyi.alps.nka.service.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时给上海资信推送数据
 * Created by renpeng on 2018/5/18.
 */
@Component
public class SendDataToShzxSchedule {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final String SEND_DATA_TO_SHZX_SHCEDULE_LOCK  = "getsendDataToShzxShceduleLockTest";
//     今天跑
//    @Scheduled(cron = "0 30 15 23 * ?")
//    每个月1号12点10分跑
    @Scheduled(cron = "0 10 0 1 * ?")
    public void sendDataSchedule() {
        try {
            if (redisTemplate.opsForValue().setIfAbsent(SEND_DATA_TO_SHZX_SHCEDULE_LOCK, "executing")) {
                logger.info("[SHZX]send data to SHZX");
                try {
                    logger.info("=============这里是要执行的程序=============");
                } catch (Exception e) {
                    logger.error("[SHZX] SendDataToShzxSchedule -> upload error ",e);
                }
                redisTemplate.delete(SEND_DATA_TO_SHZX_SHCEDULE_LOCK);
            } else {
                logger.info("[SHZX]回传数据到上海资信：执行中，跳过");
            }
        } catch (Exception e) {
            logger.error("[SHZX]回传数据到上海资信：出错", e);
            redisTemplate.delete(SEND_DATA_TO_SHZX_SHCEDULE_LOCK);
        }
        logger.info("[SHZX]回传数据到上海资信：结束");
    }

}
