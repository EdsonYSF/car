package com.za.carweb.controller;

import com.za.carshare.web.WebService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @outhor YSF
 * @create 2020/11/27 16:15
 */
@Slf4j
@RestController
@Api(value = "Web接口服务", tags = {"Web接口服务"})
public class WebProxyController implements WebService {
}
