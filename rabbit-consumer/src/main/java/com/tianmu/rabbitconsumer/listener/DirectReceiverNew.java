package com.tianmu.rabbitconsumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Kris_Yao
 * @version 1.0
 * @date 2021/5/13 13:15
 * @blog https://yybadmin.github.io/
 */

@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称
public class DirectReceiverNew {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("-----NewDirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}
