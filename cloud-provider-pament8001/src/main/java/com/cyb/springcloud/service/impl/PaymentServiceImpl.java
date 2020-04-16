package com.cyb.springcloud.service.impl;

import com.cyb.springcloud.dao.PaymentDao;
import com.cyb.springcloud.entities.Payment;
import com.cyb.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cyb on 2020/4/15 17:26
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
