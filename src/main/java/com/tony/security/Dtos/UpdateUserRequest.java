package com.tony.security.Dtos;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserRequest {

    private String username;
    private String email;
    private String password;
    private Set<Long> roleIds;
}
