package com.example.springbootudemy.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author DuyND
 * @name SpringSecurityConfiguration.java
 * @date 10/08/2023
 */
@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        // 1. All request should be authenticated
        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

        // 2. if a request is not authenticated, a web page is shown
        httpSecurity.httpBasic(Customizer.withDefaults());

        // 3. CSRF -> POST, PUT
        httpSecurity.csrf(AbstractHttpConfigurer::disable);

        return httpSecurity.build();
    }
}

