package com.example.springsecurityjwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private int id;
    private String username;
    private String address;
    private String email;
    private String password;
    private String role;
}
