package com.tony.security.Mappers;

import com.tony.security.Dtos.RoleDto;
import com.tony.security.Entities.Roles;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class RoleMapper {

    private final ModelMapper modelMapper;

    public RoleDto toDto(Roles role) {
        return modelMapper.map(role, RoleDto.class);
    }
}