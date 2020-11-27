package com.za.caradmin.controller;

import com.za.carshare.admin.AdminService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @outhor YSF
 * @create 2020/11/27 16:17
 */
@Slf4j
@RestController
@Api(value = "Admin接口服务", tags = {"Admin接口服务"})
public class AdminProxyController implements AdminService {
}
