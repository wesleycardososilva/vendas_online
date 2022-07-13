package com.wesleycardososilva.vendas_online.service;

import com.wesleycardososilva.vendas_online.entity.Product;
import com.wesleycardososilva.vendas_online.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
