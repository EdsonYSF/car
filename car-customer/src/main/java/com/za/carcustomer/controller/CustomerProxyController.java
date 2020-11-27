package com.za.carcustomer.controller;

import com.za.carshare.customer.CustomerService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @outhor YSF
 * @create 2020/11/27 16:18
 */
@Slf4j
@RestController
@Api(value = "Customer接口服务", tags = {"Customer接口服务"})
public class CustomerProxyController implements CustomerService {
}
