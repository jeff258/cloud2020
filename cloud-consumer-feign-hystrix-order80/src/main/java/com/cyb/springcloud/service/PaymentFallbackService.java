package com.cyb.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by cyb on 2020/5/8 14:40
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id)

        {
            return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
        }


    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
