package com.estagio.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estagio.apirest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

}
