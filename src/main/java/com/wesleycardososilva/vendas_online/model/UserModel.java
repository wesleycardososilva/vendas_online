package com.wesleycardososilva.vendas_online.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private String firstName;
    private String lastname;
    private String email;
    private String password;
}
