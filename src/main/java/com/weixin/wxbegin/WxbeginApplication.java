package com.weixin.wxbegin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.weixin.wxbegin.UserMapper") //扫描的mapper
@SpringBootApplication
public class WxbeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxbeginApplication.class, args);
    }

}
