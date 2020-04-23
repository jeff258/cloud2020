package com.cyb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PamentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PamentMain8002.class);
    }
}
