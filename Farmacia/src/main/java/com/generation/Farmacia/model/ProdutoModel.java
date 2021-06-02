package com.generation.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "produto")
public class ProdutoModel 
{
	//atributos 
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String nomeProduto;
	
	@NotNull
	private double valorProduto;
	
	//encapsulamento
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	
	

}
