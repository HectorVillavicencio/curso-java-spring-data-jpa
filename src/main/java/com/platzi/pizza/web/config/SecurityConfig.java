package com.platzi.pizza.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // desabilita completamente el csrf()
                .cors().and()// habilita los cors
                .authorizeHttpRequests()
                .anyRequest()// cualquier peticion
                //.permitAll();// para permitir todo
                .authenticated()
                .and()
                .httpBasic();
        return http.build();
    }
}
