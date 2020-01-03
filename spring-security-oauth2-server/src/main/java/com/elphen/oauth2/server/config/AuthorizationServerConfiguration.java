package com.elphen.oauth2.server.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @program: spring-security-oauth2
 * @description: 认证服务器配置类
 * @author: Elphen
 * @create: 2020-01-03 16:57
 **/
@Configuration      //开启配置注解
@EnableAuthorizationServer   //开启认证服务器注解
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    /**
     * 重写客户端认证方法
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client")
                .secret("secret")
                .authorizedGrantTypes("authorization_code")
                .scopes("miniapp")
                .redirectUris("http://localhost:12180/api/v1/event/oauth2");
    }
}
