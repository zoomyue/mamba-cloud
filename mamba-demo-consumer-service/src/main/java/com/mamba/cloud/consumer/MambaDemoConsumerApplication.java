package com.mamba.cloud.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MambaDemoConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaDemoConsumerApplication.class).run(args);
    }

}
