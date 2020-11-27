package com.za.carcustomer.proxy;

import com.za.carcustomer.config.FeignConfig;
import com.za.carshare.web.WebService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-web",configuration = FeignConfig.class)
public interface WebServiceProxy extends WebService {
}
