package com.za.carweb.proxy;

import com.za.carshare.wechat.WeChatService;
import com.za.carweb.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-WeChat",configuration = FeignConfig.class)
public interface WeChatServiceProxy extends WeChatService {
}
