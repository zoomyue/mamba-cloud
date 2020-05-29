package com.mamba.cloud.consumer.feign.callback;

import com.mamba.cloud.consumer.feign.DemoFeignClients;
import org.springframework.stereotype.Component;

@Component
public class DemoFeignFailCallbackClients implements DemoFeignClients {

    @Override
    public String sayHello(String name) {
        return "Hi!";
    }

}
