package com.mamba.cloud.consumer.feign;

import com.mamba.cloud.consumer.feign.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "mamba-demo-provider-service", configuration = FeignConfiguration.class)
public interface DemoFeignClients {

    @GetMapping("/hello/{name}")
    String sayHello(@PathVariable("name") String name);

}
