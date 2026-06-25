package com.tony.security.Mappers;

import com.tony.security.Configurations.ModelMapperConfig;
import com.tony.security.Dtos.CreateUserRequest;
import com.tony.security.Dtos.UserDto;
import com.tony.security.Entities.Users;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component

public class UserMapper {

    private final ModelMapper modelMapper;

    public Users toEntity(CreateUserRequest request){
        return modelMapper.map(request, Users.class);
    }

    public UserDto toDto(Users user){
        return modelMapper.map(user, UserDto.class);
    };
}
