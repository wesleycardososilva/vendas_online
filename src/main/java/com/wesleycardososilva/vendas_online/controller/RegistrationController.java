package com.wesleycardososilva.vendas_online.controller;

import com.wesleycardososilva.vendas_online.entity.User;
import com.wesleycardososilva.vendas_online.model.UserModel;
import com.wesleycardososilva.vendas_online.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RegistrationController {

    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
        User user = userService.registerUser(userModel);
        return "Success";
    }
}
