package com.tony.security.Services;

import com.tony.security.Dtos.CreateUserRequest;
import com.tony.security.Dtos.UpdateUserRequest;
import com.tony.security.Dtos.UserDto;
import com.tony.security.Entities.Roles;
import com.tony.security.Entities.Users;
import com.tony.security.Mappers.UserMapper;
import com.tony.security.Repositories.RoleRepository;
import com.tony.security.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    // CREATE
    public UserDto createUser(CreateUserRequest request) {

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        Users user = new Users();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        Set<Roles> roles = new HashSet<>(roleRepository.findAllById(request.getRoleIds()));

        user.setRoles(roles);
        Users saved = userRepository.save(user);
        return userMapper.toDto(saved);
    }

    // READ ALL
    public List<UserDto> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

    // READ BY ID
    public UserDto getUserById(Long id) {
        Users user =  userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return userMapper.toDto(user);
    }


    // UPDATE
    public UserDto updateUser(Long id, UpdateUserRequest request) {

        Users user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (request.getEmail() != null) {
            user.setEmail(request.getEmail());
        }

        if (request.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(request.getPassword()));
        }

        if (request.getRoleIds() != null) {
            Set<Roles> roles = new HashSet<>(roleRepository.findAllById(request.getRoleIds()));
            user.setRoles(roles);
        }

        Users saved = userRepository.save(user);
        return userMapper.toDto(saved);
    }

    // DELETE
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }

        userRepository.deleteById(id);
    }
}
