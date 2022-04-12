package com.vendas.app.rest.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.app.models.Produto;
import com.vendas.app.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public ProdutoFormRequest save(@RequestBody ProdutoFormRequest produto) {
		Produto entidadeProduto = new Produto(
			produto.getNome(), 
			produto.getDescricao(), 
			produto.getPreco(), 
			produto.getSku()
		);
		
		produtoRepository.save(entidadeProduto);
		System.out.println(entidadeProduto);
		
		return produto;
	};
}
