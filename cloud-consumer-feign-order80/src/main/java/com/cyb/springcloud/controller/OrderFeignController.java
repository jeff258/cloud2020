package com.cyb.springcloud.controller;

import com.cyb.springcloud.entities.CommonResult;
import com.cyb.springcloud.entities.Payment;
import com.cyb.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by cyb on 2020/4/30 15:44
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        CommonResult<Payment> payment = paymentFeignService.getPaymentById(id);
        Integer code = payment.getCode();
        String message = payment.getMessage();
        Payment data = payment.getData();

        CommonResult<Payment> result =new CommonResult(code,message,data);
        Payment p=new Payment((long)1,"222222");
        CommonResult<Payment> result2 =new CommonResult(200,"成功",p);
        return result2;
    }



}
