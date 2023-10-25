package com.example.springbootudemy.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DuyND
 * @name ExampleMessagesController.java
 * @date 23/07/2023
 */
@RestController
@RequestMapping("/api/v1")
public class ExampleMessagesController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/get/message")
    public String getMessage(HttpServletRequest request) {
        String text = messageSource.getMessage("duynd.fullname.message", null, request.getLocale());

        String text2 = messageSource.getMessage("duynd.fullname.message", new String[]{"Bên em " +
                        "anh bổng thấy cuộc đời, thấy cuộc đời xanh hơn", "Trần Sơn Giang"},
                request.getLocale());

        return text2;

    }
}
