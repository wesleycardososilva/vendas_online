package com.wesleycardososilva.vendas_online.repository;

import com.wesleycardososilva.vendas_online.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DataJpaTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void saveProduct(){
        Product product = Product.builder()
                .name("TV")
                .price(999)
                .build();

        productRepository.save(product);

    }

    @Test
    public void printAllProducts(){
        List<Product> productList =
                productRepository.findAll();
        System.out.println("productList = " + productList);
    }
}