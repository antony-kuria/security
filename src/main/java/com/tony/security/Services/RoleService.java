package com.tony.security.Services;

import com.tony.security.Dtos.RoleDto;
import com.tony.security.Entities.Roles;
import com.tony.security.Mappers.RoleMapper;
import com.tony.security.Repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleDto createRole(RoleDto roleDto) {

        Roles role = new Roles();
        role.setName(roleDto.getName());

        Roles saved = roleRepository.save(role);

        return roleMapper.toDto(saved);
    }


    public RoleDto getRoleById(Long id) {

        Roles role = roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found with id: " + id));

        return roleMapper.toDto(role);
    }


    public List<RoleDto> getAllRoles() {
        return roleRepository.findAll()
                .stream()
                .map(roleMapper::toDto)
                .toList();
    }

    public RoleDto updateRole(Long id, RoleDto roleDto) {

        Roles role = roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role not found with id: " + id));

        role.setName(roleDto.getName());

        Roles updated = roleRepository.save(role);

        return roleMapper.toDto(updated);
    }


    public void deleteRole(Long id) {

        if (!roleRepository.existsById(id)) {
            throw new RuntimeException("Role not found with id: " + id);
        }

        roleRepository.deleteById(id);
    }

}
