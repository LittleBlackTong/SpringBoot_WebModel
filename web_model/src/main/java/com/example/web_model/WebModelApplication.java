package com.example.web_model;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.example.web_model.dao")
@ComponentScan(basePackages = {"com.example"})
@EnableScheduling
@EnableAsync
public class WebModelApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebModelApplication.class, args);
    }
}
