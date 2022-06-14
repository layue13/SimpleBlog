package com.sblog.simpleblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = {"com.sblog.simpleblog.dao"})
@EnableTransactionManagement
public class SimpleBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBlogApplication.class, args);
    }

}
