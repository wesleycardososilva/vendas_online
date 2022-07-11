package com.wesleycardososilva.vendas_online.service;

import com.wesleycardososilva.vendas_online.entity.User;
import com.wesleycardososilva.vendas_online.model.UserModel;

public interface UserService {

    public User saveUser(User user);
    User registerUser(UserModel userModel);
}
