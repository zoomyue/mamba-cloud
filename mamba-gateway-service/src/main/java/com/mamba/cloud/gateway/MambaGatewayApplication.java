package com.mamba.cloud.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 网关中心启动类
 *
 * @author dongyue
 */
@SpringCloudApplication
public class MambaGatewayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MambaGatewayApplication.class).run(args);
    }

}
