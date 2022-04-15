package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//@SpringBootApplication告诉Spring Boot框架，这是Spring Boot服务的入口点。

public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("aa");
        SpringApplication.run(DemoApplication.class, args);
    }

}