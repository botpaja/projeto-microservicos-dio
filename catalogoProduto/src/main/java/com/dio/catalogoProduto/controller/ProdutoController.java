package com.dio.catalogoProduto.controller;

import com.dio.catalogoProduto.model.Produto;
import com.dio.catalogoProduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = RequestMethod.POST)
    Produto criaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Produto> buscaById(@PathVariable Integer id) {
        return produtoRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void removeById(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
    }

}