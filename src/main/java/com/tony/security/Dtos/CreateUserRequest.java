package com.tony.security.Dtos;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    private String username;
    private String email;
    private String password;
    private Set<Long> roleIds; // safer than sending full Role objects
}
