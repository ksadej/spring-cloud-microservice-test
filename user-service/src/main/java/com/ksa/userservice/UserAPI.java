package com.ksa.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAPI {

    @GetMapping
    public String helloWorld(){
        return "User API";
    }
}
