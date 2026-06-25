package com.tony.security.Services;

import com.tony.security.Dtos.LoginRequest;
import com.tony.security.Configurations.JwtUtil;
import com.tony.security.Dtos.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public LoginResponse login(LoginRequest request) {

        // 1. authenticate username + password
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        // 2. get user details
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        // 3. generate JWT
        String token = jwtUtil.generateToken(userDetails);

        System.out.println(token);
        System.out.println("USERNAME: " + request.getUsername());
        System.out.println("AUTH SET? " + SecurityContextHolder.getContext().getAuthentication());

        return new LoginResponse(token);
    }
}