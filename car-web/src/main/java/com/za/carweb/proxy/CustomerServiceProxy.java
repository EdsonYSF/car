package com.za.carweb.proxy;

import com.za.carshare.customer.CustomerService;
import com.za.carweb.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-customer",configuration = FeignConfig.class)
public interface CustomerServiceProxy extends CustomerService {
}
