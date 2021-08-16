package com.example.springcloudproducer.controller;

import com.example.springcloudproducer.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value="/testController")
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.testService();
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services){
            log.info("********注册到eureka中的服务中有:"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-CONSUMER");
        for (ServiceInstance s : instances){
            log.info("当前服务的实例有"+s.getServiceId()+"\t"+s.getHost()+"\t"+s.getPort()+"\t"+s.getUri());
        }
        return this.discoveryClient;
    }
}
