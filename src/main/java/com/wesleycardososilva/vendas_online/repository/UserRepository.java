package com.wesleycardososilva.vendas_online.repository;

import com.wesleycardososilva.vendas_online.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
