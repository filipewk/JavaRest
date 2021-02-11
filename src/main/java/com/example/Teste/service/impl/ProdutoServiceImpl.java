package com.example.Teste.service.impl;

import com.example.Teste.framework.CrudServiceImpl;
import com.example.Teste.model.Produto;
import com.example.Teste.repository.ProdutoRepository;
import com.example.Teste.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public JpaRepository<Produto, Long> getRepository() {
        return produtoRepository;
    }
}
