package com.cyb.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cyb on 2020/7/11 15:04
 */
@Configuration
@MapperScan({"com.cyb.springcloud.dao"})
public class MyBatisConfig {
}
