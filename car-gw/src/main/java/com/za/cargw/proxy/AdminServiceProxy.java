package com.za.cargw.proxy;

import com.za.cargw.config.FeignConfig;
import com.za.carshare.admin.AdminService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-admin",configuration = FeignConfig.class)
public interface AdminServiceProxy extends AdminService {
}
