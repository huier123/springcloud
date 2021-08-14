package com.example.springcloudproducer.controller;

import com.example.springcloudproducer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testController")
public class TestController {

    @Autowired
    TestService testService;
    @RequestMapping("/test")
    public String test(){
        return testService.testService();
    }
}
