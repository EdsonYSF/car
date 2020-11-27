package com.za.carcustomer.proxy;

import com.za.carcustomer.config.FeignConfig;
import com.za.carshare.gw.GwService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-gw",configuration = FeignConfig.class)
public interface GwServiceProxy extends GwService {
}
