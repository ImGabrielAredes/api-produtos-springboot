package com.exemplo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.app.model.Produto;
import com.exemplo.app.service.ProdutoService;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/produtos")
public class ProdutoController {

    @Autowired
    private final ProdutoService produtoService;
    
    @GetMapping(path = "/all")
    public ResponseEntity<List<Produto>> listarProdutos() {
        List <Produto> produtos = produtoService.listarTodosProdutos();
        return new ResponseEntity<>(produtos, HttpStatus.OK);
    }
}
