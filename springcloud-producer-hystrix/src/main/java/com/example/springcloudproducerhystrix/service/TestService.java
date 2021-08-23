package com.example.springcloudproducerhystrix.service;

public interface TestService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentInfo_TimeOutHabdler(Integer id);
}
