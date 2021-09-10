package com.dio.catalogoProduto.repository;

import com.dio.catalogoProduto.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
