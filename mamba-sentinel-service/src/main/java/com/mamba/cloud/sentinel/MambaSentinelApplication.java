package com.mamba.cloud.sentinel;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MambaSentinelApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaSentinelApplication.class).run(args);
    }

}
