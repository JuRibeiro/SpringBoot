package com.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.minhaLojaDeGames.model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>
{
	public List<CategoriaModel>findAllByDescricaoContainingIgnoreCase (String descricao);

}
