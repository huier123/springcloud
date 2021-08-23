package com.example.springbcloudconsumerhystrix.controller;

import com.example.springbcloudconsumerhystrix.feign.TestFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/testService")
public class TestController {

    @Autowired
    TestFeign testFeign;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = testFeign.paymentInfo_OK(id);
        log.info("*******************result:" + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = testFeign.paymentInfo_TimeOut(id);
        log.info("*********************result:" + result);
        return result;

    }
}
