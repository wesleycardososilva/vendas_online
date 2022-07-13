package com.wesleycardososilva.vendas_online.controller;

import com.wesleycardososilva.vendas_online.entity.Product;
import com.wesleycardososilva.vendas_online.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}
