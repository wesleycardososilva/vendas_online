package com.wesleycardososilva.vendas_online.service;

import com.wesleycardososilva.vendas_online.entity.User;
import com.wesleycardososilva.vendas_online.model.UserModel;
import com.wesleycardososilva.vendas_online.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User registerUser(UserModel userModel) {
        User user  = new User();
        user.setEmail(userModel.getEmail());
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastname());
        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));

        userRepository.save(user);
        return null;
    }
}
