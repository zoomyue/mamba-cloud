package com.mamba.cloud.consumer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务调用者
 *
 * @author dongyue
 */
@SpringCloudApplication
@EnableFeignClients
public class MambaDemoConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaDemoConsumerApplication.class).run(args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
