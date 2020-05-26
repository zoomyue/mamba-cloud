package com.mamba.cloud.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务调用者
 *
 * @author dongyue
 */
@SpringBootApplication
@EnableFeignClients
public class MambaDemoConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaDemoConsumerApplication.class).run(args);
    }

}
