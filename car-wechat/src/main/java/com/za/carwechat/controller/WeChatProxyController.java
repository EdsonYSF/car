package com.za.carwechat.controller;

import com.za.carshare.wechat.WeChatService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @outhor YSF
 * @create 2020/11/27 16:35
 */
@Slf4j
@RestController
@Api(value = "WeChat接口服务", tags = {"WeChat接口服务"})
public class WeChatProxyController implements WeChatService {
}
