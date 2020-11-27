package com.za.caradmin.proxy;

import com.za.caradmin.config.FeignConfig;
import com.za.carshare.gw.GwService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-gw",configuration = FeignConfig.class)
public interface GwServiceProxy extends GwService {
}
