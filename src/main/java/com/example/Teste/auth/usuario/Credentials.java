package com.example.Teste.auth.usuario;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Credentials {
    @Column(nullable = false, length = 255)
    private String password;
}