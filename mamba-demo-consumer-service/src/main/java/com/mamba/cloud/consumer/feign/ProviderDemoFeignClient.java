package com.mamba.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("mamba-demo-provider-service")
public interface ProviderDemoFeignClient {

    @GetMapping("/getTitle")
    public String getTitle();

}
