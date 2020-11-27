package com.za.carweb.proxy;

import com.za.carshare.admin.AdminService;
import com.za.carweb.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-admin",configuration = FeignConfig.class)
public interface AdminServiceProxy extends AdminService {
}
