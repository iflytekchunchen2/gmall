package com.iflytek.gmall.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class GmallUserWebsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserWebsApplication.class, args);
    }

}
