package com.example.mybatiswork;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatiswork.mapper")
@SpringBootApplication
public class MybatisworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisworkApplication.class, args);
    }

}
