package com.mamba.cloud.consumer.feign;

import com.mamba.cloud.consumer.feign.callback.DemoFeignFailCallbackClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "mamba-demo-provider-service", fallback = DemoFeignFailCallbackClients.class)
public interface DemoFeignClients {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    String sayHello(@PathVariable("name") String name);

}
