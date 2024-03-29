package com.aledguedes.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aledguedes.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

}
