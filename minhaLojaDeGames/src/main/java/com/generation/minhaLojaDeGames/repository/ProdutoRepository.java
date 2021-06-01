package com.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.minhaLojaDeGames.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>
{
	//interface é um contrato
	//Repository – classe responsável pela comunicação com o banco de dados 
	//(manipulação de dados); (select)
		
	//find all buscar todos pelo titulo (atributo entidade)
	//containing = like caracteres digitados
	//ignore : não leva em consideração maiusculo e minusculo no nomeProduto
	
	public List<ProdutoModel> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
	

}
