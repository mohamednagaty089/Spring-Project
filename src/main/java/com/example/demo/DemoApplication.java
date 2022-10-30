package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication /* start point for scan class */
@ComponentScan("com.example.ddd")
@ComponentScan("com.example.Model")
@ComponentScan("com.example.Repository")
@ComponentScan("com.example.controller")
@ComponentScan("com.example.Config")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
