package com.za.caradmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class HealthController {

    @Value("${service.name}")
    public String name;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 健康检查
     *
     * @return
     */
    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public String health() {
        return name;
    }


    @RequestMapping("/redisHandler")
    public String redisHandler() {
        stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
        return stringRedisTemplate.opsForValue().get("k5");
    }

}