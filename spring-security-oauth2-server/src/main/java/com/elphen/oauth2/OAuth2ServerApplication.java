package com.elphen.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: spring-security-oauth2
 * @description: 认证服务器启动类
 * @author: Elphen
 * @create: 2020-01-03 16:53
 **/
@SpringBootApplication
public class OAuth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
