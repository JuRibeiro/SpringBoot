package com.generation.minhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.minhaLojaDeGames.model.ProdutoModel;
import com.generation.minhaLojaDeGames.repository.ProdutoRepository;

@RestController
@RequestMapping ("/produto")
@CrossOrigin ("*")
public class ProdutoController 
{
	@Autowired
	private ProdutoRepository repository;
	
	//por que essa parte ? Para retornar todos os dados, sem filtro
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<ProdutoModel> getById (@PathVariable long id)
	{
		return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	//postar um novo dado
		@PostMapping
	                                         // ??
	public ResponseEntity<ProdutoModel> post (@RequestBody ProdutoModel produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
		
	//update
	@PutMapping
	public ResponseEntity<ProdutoModel> put (@RequestBody ProdutoModel produto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}
		
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id)
	{
		repository.deleteById(null);
	}
		
}
