package com.ksa.productservice.controller;

import com.ksa.productservice.model.Product;
import com.ksa.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return  productRepository.save(product);
    }
}
