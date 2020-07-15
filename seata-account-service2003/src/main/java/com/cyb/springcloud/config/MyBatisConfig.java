package com.cyb.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther cyb
 * @create 2020-07-11
 */
@Configuration
@MapperScan({"com.cyb.springcloud.dao"})
public class MyBatisConfig {
}
