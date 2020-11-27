package com.za.cargw.proxy;

import com.za.cargw.config.FeignConfig;
import com.za.carshare.customer.CustomerService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-customer",configuration = FeignConfig.class)
public interface CustomerServiceProxy extends CustomerService {
}
