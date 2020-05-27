package com.mamba.cloud.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MambaDemoProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaDemoProviderApplication.class).run(args);
    }

}