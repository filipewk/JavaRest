package com.example.Teste.auth.usuario;

import com.example.Teste.framework.CrudService;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioService extends CrudService<Usuario, Long> {
    Usuario loadUserByUsername(String username);
}
