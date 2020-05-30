package com.mamba.cloud.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心 集群
 * 启动类
 *
 * @author dongyue
 */
@SpringBootApplication
@EnableEurekaServer
public class MambaDiscoveryClusterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaDiscoveryClusterApplication.class).run(args);
    }

}
