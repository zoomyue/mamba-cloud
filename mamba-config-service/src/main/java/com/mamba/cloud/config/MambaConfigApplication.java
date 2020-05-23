package com.mamba.cloud.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心服务端启动类
 *
 * @author dongyue
 */
@SpringCloudApplication
@EnableConfigServer
public class MambaConfigApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaConfigApplication.class).run(args);
    }

}
