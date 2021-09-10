package com.dio.carrinhoCompra.controller;

import com.dio.carrinhoCompra.model.Carrinho;
import com.dio.carrinhoCompra.model.Item;
import com.dio.carrinhoCompra.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Carrinho adicionaItem(@PathVariable("id") Integer id, @RequestBody Item item) {
        Optional<Carrinho> salvaCarrinho = carrinhoRepository.findById(id);
        Carrinho carrinho;
        if (salvaCarrinho.equals(Optional.empty())) {
            carrinho = new Carrinho(id);
        }
        else {
            carrinho = salvaCarrinho.get();
        }
        carrinho.getItems().add(item);
        return carrinhoRepository.save(carrinho);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Carrinho> buscaById(@PathVariable("id") Integer id) {
        return carrinhoRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void apaga(@PathVariable("id") Integer id) {
        carrinhoRepository.deleteById(id);
    }

}
