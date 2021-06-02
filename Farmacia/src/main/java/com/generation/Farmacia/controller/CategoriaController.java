package com.generation.Farmacia.controller;

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

import com.generation.Farmacia.model.CategoriaModel;
import com.generation.Farmacia.repository.CategoriaRepository;

@RestController
@RequestMapping
@CrossOrigin ("*")
public class CategoriaController 
{
	//chamando o repositorio
	@Autowired
	private CategoriaRepository repository;
	
	//Para trazer todas as informações, sem filtro 
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll ()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	//Trazendo as informações filtradas pelo id 
	@GetMapping ("/{id}")
	public ResponseEntity<CategoriaModel> getById (@PathVariable long id)
	{
		return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	//Postar um novo dado 
	@PostMapping
	public ResponseEntity<CategoriaModel> post (@RequestBody CategoriaModel categoria)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<CategoriaModel> put (@RequestBody CategoriaModel categoria)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping
	public void deleste (@PathVariable long id)
	{
		repository.deleteById(id);
	}
	
}