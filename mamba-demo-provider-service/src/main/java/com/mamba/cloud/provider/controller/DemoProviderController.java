package com.mamba.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoProviderController {

    @Value("${spring.application.name}")
    private String name;

    @Value("${spring.datasource.url}")
    private String url;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello, ".concat(name).concat(" ! ");
    }

    @GetMapping(value = "/getName")
    public String getName() {
        return name;
    }

    @GetMapping(value = "/getUrl")
    public String getUrl() {
        return url;
    }

    @GetMapping(value = "/getServicesInstance/{applicationName}")
    public List<ServiceInstance> getServicesInstance(@PathVariable("applicationName") String applicationName) {
        return discoveryClient.getInstances(applicationName);
    }

}
