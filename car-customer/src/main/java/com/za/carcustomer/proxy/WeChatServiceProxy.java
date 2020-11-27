package com.za.carcustomer.proxy;

import com.za.carcustomer.config.FeignConfig;
import com.za.carshare.wechat.WeChatService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-WeChat",configuration = FeignConfig.class)
public interface WeChatServiceProxy extends WeChatService {
}
