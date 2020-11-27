package com.za.cargw.controller;

import com.za.carshare.gw.GwService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @outhor YSF
 * @create 2020/11/27 16:17
 */
@Slf4j
@RestController
@Api(value = "Gw接口服务", tags = {"Gw接口服务"})
public class GwProxyController implements GwService {
}
