package com.wesleycardososilva.vendas_online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface Category extends JpaRepository<Category, Id>{
}
