package com.dio.carrinhoCompra.repository;

import com.dio.carrinhoCompra.model.Carrinho;
import org.springframework.data.repository.CrudRepository;

public interface CarrinhoRepository extends CrudRepository<Carrinho, Integer> {
//    Carrinho findByClienteId(Integer clienteId);
}
