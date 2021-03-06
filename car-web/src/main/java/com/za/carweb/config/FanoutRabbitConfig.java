package com.za.carweb.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @outhor YSF
 * @create 2020/9/10 16:25
 * 扇形交换机
 */
@Configuration
public class FanoutRabbitConfig {

    @Value("${queueConfig.sectorNameA}")
    private String sectorNameA;

    @Value("${queueConfig.sectorNameB}")
    private String sectorNameB;

    @Value("${queueConfig.sectorNameC}")
    private String sectorNameC;


    /**
     *  创建三个队列 ：fanout.A   fanout.B  fanout.C
     *  将三个队列都绑定在交换机 fanoutExchange 上
     *  因为是扇型交换机, 路由键无需配置,配置也不起作用
     */
    @Bean
    public Queue queueA() {
        return new Queue(sectorNameA);
    }

    @Bean
    public Queue queueB() {
        return new Queue(sectorNameB);
    }

    @Bean
    public Queue queueC() {
        return new Queue(sectorNameC);
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangeA() {
        return BindingBuilder.bind(queueA()).to(fanoutExchange());
    }

    @Bean
    Binding bindingExchangeB() {
        return BindingBuilder.bind(queueB()).to(fanoutExchange());
    }

    @Bean
    Binding bindingExchangeC() {
        return BindingBuilder.bind(queueC()).to(fanoutExchange());
    }
}
