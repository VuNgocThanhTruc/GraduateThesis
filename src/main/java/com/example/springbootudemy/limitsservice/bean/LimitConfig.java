package com.example.springbootudemy.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author DuyND
 * @name LimitConfig.java
 * @date 25/08/2023
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties("limits-service")
public class LimitConfig {

    @Value("${limits-service-maximum}")
    private int maximum;

    @Value("${limits-service-minimum}")
    private int minimum;
}
