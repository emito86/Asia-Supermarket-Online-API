package com.asiasupermarket.AsiaSupermarketOnlineAPI.controller;

import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.model.Product;
import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class AsiaSupermarketController {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/products/{productId}")
    public Product getProduct(@PathVariable int productId) {
        return productService.getProduct(productId);

    }

    @PostMapping(path = "/products/save")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

}

