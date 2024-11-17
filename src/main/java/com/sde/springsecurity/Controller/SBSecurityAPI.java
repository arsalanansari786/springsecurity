package com.sde.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testApi1")
public class SBSecurityAPI {
@GetMapping("/showMe")
    public String getMethodName() {
        return "SpringSecurity Test success";
    }
}
