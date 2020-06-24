package com.cyb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by cyb on 2020/5/12 14:42
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

  /*  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.web(true).sources(ConfigApplication.class);
    }*/
}