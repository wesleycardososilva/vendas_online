package com.wesleycardososilva.vendas_online.repository;

import com.wesleycardososilva.vendas_online.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
