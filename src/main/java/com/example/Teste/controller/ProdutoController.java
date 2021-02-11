package com.example.Teste.controller;

import com.example.Teste.framework.CrudRestController;
import com.example.Teste.framework.CrudService;
import com.example.Teste.model.Produto;
import com.example.Teste.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController extends CrudRestController<Produto, Long> {

    @Autowired
    ProdutoService produtoService;

    @Override
    public CrudService<Produto, Long> getService() {
        return produtoService;
    }
}
