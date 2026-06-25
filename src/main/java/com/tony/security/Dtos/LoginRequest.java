package com.tony.security.Dtos;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;

}
