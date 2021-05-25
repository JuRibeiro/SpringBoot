package com.helloworld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/helloWorld")

public class Tarefa1Controller 
{
	@GetMapping
	public String MentalidadesHabilidades()
	{
		return "MENTALIDADES: "
				+ "\n Orientação ao Futuro"
				+ "\n Reponsabilidade Pessoal"
				+ "\n Mentalidade de Crescimento"
				+ "\n Persistência"
				+ "\n"
				+ "\n"
				+ "HABILIDADES: "
				+ "\n Trabalho em Equipe"
				+ "\n Atenção aos Detalhes"
				+ "\n Proatividade"
				+ "\n Comunicação";
	}
}
