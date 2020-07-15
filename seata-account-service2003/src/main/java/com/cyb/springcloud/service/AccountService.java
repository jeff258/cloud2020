package com.cyb.springcloud.service;

import java.math.BigDecimal;

/**
 * Created by cyb on 2020/7/11 15:40
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}
