package com.generation.Farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.Farmacia.model.ProdutoModel;
import com.generation.Farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping
@CrossOrigin ("*")
public class ProdutoController 
{
	@Autowired
	private ProdutoRepository repository;

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
	
	@PostMapping
	public ResponseEntity<ProdutoModel> post (@RequestBody ProdutoModel produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	
}
