package com.cyb.springcloud.controller;

import com.cyb.springcloud.entities.CommonResult;
import com.cyb.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by cyb on 2020/7/11 15:39
 */
@RestController
@Slf4j

public class AccountController {
    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     */
    @PostMapping("/account/decrease")
    public CommonResult decrease( Long userId,  BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
