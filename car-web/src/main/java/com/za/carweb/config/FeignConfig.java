package com.za.carweb.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author
 * feign 配置类
 */
@Configuration
public class FeignConfig {

    /**
     * feign取消重试
     * @return
     */
    @Bean
    Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }

    /**
     * feign请求超时设置
     * @param env
     * @return
     */
    @Bean
    Request.Options requestOptions(ConfigurableEnvironment env){
        int ribbonReadTimeout = env.getProperty("ribbon.ReadTimeout", int.class, 500000);
        int ribbonConnectionTimeout = env.getProperty("ribbon.ConnectTimeout", int.class, 300000);
        return new Request.Options(ribbonConnectionTimeout, ribbonReadTimeout);
    }


    /**
     * feign 客户端请求日志打印
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
