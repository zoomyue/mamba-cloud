package com.mamba.cloud.discovery.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 注册中心
 * 检测注册成功监听
 *
 * @author dongyue
 */
@Configuration
public class EurekaInstanceRegisteredListener implements ApplicationListener<EurekaInstanceRegisteredEvent> {

    private Logger logger = LoggerFactory.getLogger(EurekaInstanceRegisteredListener.class);

    @Override
    public void onApplicationEvent(EurekaInstanceRegisteredEvent eurekaInstanceRegisteredEvent) {
        logger.info("服务：{}，注册成功了...", eurekaInstanceRegisteredEvent.getInstanceInfo().getAppName());
    }

}
