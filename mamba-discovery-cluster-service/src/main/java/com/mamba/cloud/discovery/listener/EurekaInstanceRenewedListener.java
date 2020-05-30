package com.mamba.cloud.discovery.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 注册中心
 * 心跳检测服务
 *
 * @author dongyue
 */
@Configuration
public class EurekaInstanceRenewedListener implements ApplicationListener<EurekaInstanceRenewedEvent> {

    private Logger logger = LoggerFactory.getLogger(EurekaInstanceRenewedListener.class);

    @Override
    public void onApplicationEvent(EurekaInstanceRenewedEvent eurekaInstanceRenewedEvent) {
        logger.info("心跳检测服务：{}", eurekaInstanceRenewedEvent.getInstanceInfo().getAppName());
    }

}
