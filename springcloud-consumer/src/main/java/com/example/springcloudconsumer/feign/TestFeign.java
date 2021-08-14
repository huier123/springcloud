package com.example.springcloudconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "testFeign",url = "${feign.springcloud.producerurl}")
public interface TestFeign {

    @RequestMapping("/testController/test")
    String producerTestControllerTest();
}
