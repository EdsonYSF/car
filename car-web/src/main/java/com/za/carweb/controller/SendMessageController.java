package com.za.carweb.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @outhor YSF
 * @create 2020/9/10 16:13
 */
@RestController
public class SendMessageController {

    @Autowired
    RabbitTemplate rabbitTemplate;  //使用RabbitTemplate,这提供了接收/发送等等方法

    /**
     * 推送普通消息
     * @return
     */
//    @Scheduled(cron = "0/60 * * * * MON-SAT")
    public void sendDirectMessage() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "RabbitMq 推送普通消息";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String,Object> map=new HashMap<>();
        map.put("messageId",messageId);
        map.put("messageData",messageData);
        map.put("createTime",createTime);
        //将消息携带绑定键值：TestDirectRouting 发送到交换机TestDirectExchange
        rabbitTemplate.convertAndSend("TestDirectExchange", "TestDirectRouting", map);
        System.out.println("推送普通消息成功");
    }

    /**
     * 推送消息到主题交换机
     * @return
     */
//    @Scheduled(cron = "0/30 * * * * MON-SAT")
    public void sendTopicMessage1() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "RabbitMq 推送消息到主题交换机   1======";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> manMap = new HashMap<>();
        manMap.put("messageId", messageId);
        manMap.put("messageData", messageData);
        manMap.put("createTime", createTime);
        rabbitTemplate.convertAndSend("topicExchange", "topic.man", manMap);
        System.out.println("推送消息到主题交换机");
    }

    /**
     * 推送消息到主题交换机
     * @return
     */
//    @Scheduled(cron = "0/60 * * * * MON-SAT")
    public void sendTopicMessage2() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "RabbitMq 推送消息到主题交换机  2==========";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> womanMap = new HashMap<>();
        womanMap.put("messageId", messageId);
        womanMap.put("messageData", messageData);
        womanMap.put("createTime", createTime);
        rabbitTemplate.convertAndSend("topicExchange", "topic.woman", womanMap);
        System.out.println("推送消息到主题交换机");
    }

    /**
     * 推送消息到扇形交换机
     * @return
     */
//    @Scheduled(cron = "0/60 * * * * MON-SAT")
    public void sendFanoutMessage() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "RabbitMq 推送消息到扇形交换机 1234567";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> map = new HashMap<>();
        map.put("messageId", messageId);
        map.put("messageData", messageData);
        map.put("createTime", createTime);
        rabbitTemplate.convertAndSend("fanoutExchange", null, map);
        System.out.println("推送消息到扇形交换机");
    }



}
