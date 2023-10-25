package com.example.springbootudemy.limitsservice.controller;

import com.example.springbootudemy.limitsservice.bean.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DuyND
 * @name LimitsConfigController.java
 * @date 25/08/2023
 */
@RestController
public class LimitsConfigController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/limits")
    public LimitConfig retrievalLimitsFromConfig(){

        return new LimitConfig(limitConfig.getMaximum(), limitConfig.getMinimum());

    }
}
