package com.cyb.springcloud.service;

import com.cyb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by cyb on 2020/4/15 17:25
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
