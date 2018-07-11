package com.jiuyi.alps.nka.service.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化创建队列、转发器，并把队列绑定到转发器上.
 *
 * @author zhuningning
 * @create 2017/10/10.
 */
@Configuration
public class CcsRabbitConfig {

    @Bean
    public Queue acctLoanPayMessage() {
        return new Queue("card.acct.loan.pay");
    }
    
    @Bean
    public Queue cardLoanSettleMessage() {
        return new Queue("acct.cardLoan.settle");
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("ccs.topic.exchange");
    }

    @Bean
    Binding bindingExchangeLoanStatus(Queue acctLoanPayMessage, TopicExchange topicExchange) {
        return BindingBuilder.bind(acctLoanPayMessage).to(topicExchange).with("acct.cardLoan.pay");
    }
    
    @Bean
    Binding bindingExchangeSettleStatus(Queue cardLoanSettleMessage, TopicExchange topicExchange) {
        return BindingBuilder.bind(cardLoanSettleMessage).to(topicExchange).with("acct.cardLoan.settle");
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(new Jackson2JsonMessageConverter());
        return template;
    }

    /**
     * 设置消息转换.
     *
     * @param connectionFactory
     * @return
     */
    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(new Jackson2JsonMessageConverter());
        return factory;
    }
}
