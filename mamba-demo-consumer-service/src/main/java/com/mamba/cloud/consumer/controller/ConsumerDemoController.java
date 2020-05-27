package com.mamba.cloud.consumer.controller;

import com.mamba.cloud.consumer.feign.ProviderDemoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerDemoController {

    @Autowired
    private ProviderDemoFeignClient providerDemoFeignClient;

    @GetMapping("getTitle")
    public String getTitle() {
        return providerDemoFeignClient.getTitle();
    }

}
