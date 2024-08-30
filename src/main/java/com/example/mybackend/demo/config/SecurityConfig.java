package com.example.mybackend.demo.config;

import com.example.mybackend.demo.service.impl.AuthServiceImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    AuthServiceImpl authService;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .csrf().disable()
                .cors();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(authService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }
}
