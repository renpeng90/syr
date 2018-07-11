package com.jiuyi.alps.nka.service.rabbitmq;// package com.jiuyi.credit.cash.mq;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 卡贷放款状态消息接收者.
 *
 * @author zhuningning
 */
@Component
public class CcsLoanReceiver {

    private static final Logger logger = LoggerFactory.getLogger(CcsLoanReceiver.class);



    @RabbitListener(queues = "acct.cardLoan.settle", containerFactory = "rabbitListenerContainerFactory")
    @RabbitHandler
    public void receiveRepayQueue(Message message) {
        try {
            String msg = new String(message.getBody());
            logger.info("接受消息为:{}", msg);
            if (StringUtils.isEmpty(msg)) {
                logger.error("[结清消息]消息队列拿到的消息为空");
                return;
            }
            Map<String, Object> msgParams = JSON.parseObject(msg, Map.class);
            String appNo = (String) msgParams.get("appNo");
            if (StringUtils.isEmpty(appNo)) {
                logger.error("[结清消息]消息中的appNo为空");
                return;
            }
            String settleDate = (String) msgParams.get("dateTime");
            if (StringUtils.isEmpty(settleDate)) {
                logger.error("[结清消息]消息中结清时间为空");
                return;
            }
            //这里做一些业务
            logger.info("[结清消息]贷款申请记录已修改为结清,appNo:{}", appNo);
        } catch (Exception e) {
            logger.error("[结清消息]处理过程出错：", e);
        }
    }
}
