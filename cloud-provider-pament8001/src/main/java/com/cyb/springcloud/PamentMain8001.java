package com.cyb.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Created by cyb on 2020/4/15 15:16
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.cyb.springcloud.dao")
@EntityScan("com.cyb.springcloud.entities")
public class PamentMain8001 {
    public  static  void  main(String[] args){

        SpringApplication.run(PamentMain8001.class);

            }
}
