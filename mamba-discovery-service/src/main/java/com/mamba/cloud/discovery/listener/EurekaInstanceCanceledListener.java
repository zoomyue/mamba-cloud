package com.mamba.cloud.discovery.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 注册中心
 * 检测断开链接监听
 *
 * @author dongyue
 */
@Configuration
public class EurekaInstanceCanceledListener implements ApplicationListener<EurekaInstanceCanceledEvent> {

    private Logger logger = LoggerFactory.getLogger(EurekaInstanceCanceledListener.class);

    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        logger.info("服务：{}，断开链接...", eurekaInstanceCanceledEvent.getAppName());
    }
}
