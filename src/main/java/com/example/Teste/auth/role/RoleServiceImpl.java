package com.example.Teste.auth.role;

import com.example.Teste.framework.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends CrudServiceImpl<Role, Integer> implements RoleService{

    @Autowired
    RoleRepository roleRepository;

    @Override
    public JpaRepository<Role, Integer> getRepository() {
        return roleRepository;
    }
}
