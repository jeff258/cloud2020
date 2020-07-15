package com.cyb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by cyb on 2020/7/8 16:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {

        public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class, args);
    }


}
