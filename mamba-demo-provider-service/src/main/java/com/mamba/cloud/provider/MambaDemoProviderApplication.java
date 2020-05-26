package com.mamba.cloud.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 服务提供者
 *
 * @author dongyue
 */
@SpringBootApplication
public class MambaDemoProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaDemoProviderApplication.class).run(args);
    }

}
