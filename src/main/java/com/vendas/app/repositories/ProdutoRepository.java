package com.vendas.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.app.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
