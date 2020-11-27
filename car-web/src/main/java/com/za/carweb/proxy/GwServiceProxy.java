package com.za.carweb.proxy;

import com.za.carshare.gw.GwService;
import com.za.carweb.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-gw",configuration = FeignConfig.class)
public interface GwServiceProxy extends GwService {
}
