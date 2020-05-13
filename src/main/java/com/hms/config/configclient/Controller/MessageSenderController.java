package com.hms.config.configclient.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/msg")
@RestController
public class MessageSenderController {

    @Value("${message: Default Message}")
    private String message;

    @GetMapping("/get")
    public String getMessage() {
        return message;
    }
}
