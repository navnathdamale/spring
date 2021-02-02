package com.springmicro.cloud.gateway.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    private static final String USER_TIMEOUT_MESSAGE = "User service is taking loger than Expected." +
            " Please try again later";

    private static final String DEPARTMENT_TIMEOUT_MESSAGE = "Department service is taking loger than Expected." +
            " Please try again later";

    @GetMapping("/userServiceFallback")
    public String userServiceFallbackMethod() {
        return USER_TIMEOUT_MESSAGE;
    }


    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallbackMethod() {
        return DEPARTMENT_TIMEOUT_MESSAGE;
    }
}
