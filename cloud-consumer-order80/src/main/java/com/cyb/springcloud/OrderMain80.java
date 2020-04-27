package com.cyb.springcloud;

import com.cyb.rules.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @auther zzyy
 * @create 2020-02-18 17:20
 */
@SpringBootApplication
@EnableEurekaClient
//@Import({MySelfRule.class})
//@RibbonClient(configuration=MySelfRule.class)
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration=MySelfRule.class)
public class OrderMain80
{
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);

       /* Object myRule = context.getBean("myRule");
        System.out.println(myRule+"=================================+++++++++++++++>>>getRestTemplate");*/
       /* for (String beanName : beanNames) {
            System.out.println(beanName+"================*******beanname**********=================");
        }*/
    }
}
