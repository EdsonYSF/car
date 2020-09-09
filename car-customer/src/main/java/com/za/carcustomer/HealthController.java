package com.za.carcustomer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HealthController {

    @Value("${test.name}")
    private String name;

    /**
     * 健康检查
     * @return
     */
    @RequestMapping(value = "/healthCheck",method = RequestMethod.GET)
    public String health(){
        return name;
    }

    @GetMapping(value = "index")
    public String index(){
        return "index";
    }
}
