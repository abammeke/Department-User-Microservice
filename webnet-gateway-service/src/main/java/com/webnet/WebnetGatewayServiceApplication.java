package com.webnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class WebnetGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebnetGatewayServiceApplication.class, args);
    }

}
