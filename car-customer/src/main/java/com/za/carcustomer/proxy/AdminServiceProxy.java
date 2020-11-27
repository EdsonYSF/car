package com.za.carcustomer.proxy;

import com.za.carcustomer.config.FeignConfig;
import com.za.carshare.admin.AdminService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "car-admin",configuration = FeignConfig.class)
public interface AdminServiceProxy extends AdminService {
}
