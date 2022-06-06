package com.ksa.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductAPI {

    @GetMapping
    public String helloWorld(){
        return "Product API";
    }
}
