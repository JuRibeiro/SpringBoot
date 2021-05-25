package com.helloworld2.helloWorld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/helloWorld2")

public class Tarefa2Controller 
{
	@GetMapping
	public String MinhaSegundaAplicação()
	{
		return "MEUS OBJETIVOS DE APRENDIZAGEM PARA ESTA SEMANA:"
				+ "\n-Conseguir organizar o aprendizado de como um projeto Spring é realizado;"
				+ "\n-Realizar todas as tarefas disponiveis, ajudando a fixar o conteudo;"
				+ "\n-Estar disponivel e atenta nas aulas sincronas e assincronas.";
	}
}
