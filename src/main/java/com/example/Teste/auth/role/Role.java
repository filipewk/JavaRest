package com.example.Teste.auth.role;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "role")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private EnumRole nome;

    private Role(EnumRole nome) {
       this.nome = nome;
    }

    @Override
    public String getAuthority() {
        return this.nome.name();
    }
}
