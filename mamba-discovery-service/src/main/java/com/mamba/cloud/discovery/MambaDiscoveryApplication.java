package com.mamba.cloud.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 *
 * @author dongyue
 */
@SpringBootApplication
@EnableEurekaServer
public class MambaDiscoveryApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaDiscoveryApplication.class).run(args);
    }

}
