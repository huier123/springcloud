package com.example.springcloudproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testController")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hello word";
    }
}
