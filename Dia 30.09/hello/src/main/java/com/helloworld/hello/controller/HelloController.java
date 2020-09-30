package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {

	@GetMapping("/mentalidadesehabilidades")
	public String mentalidadesHabilidades() {
		return "Para realizar essa atividade, eu utilizei a mentalidade de Persistência e a habilidade de Atenção aos Detalhes! :)";
	}
	
	@GetMapping("/objetivossemana")
	public String objetivosSemana() {
		return "Essa semana eu pretendo entender melhor a aplicação e conceito do Spring e back end.\nTambém focarei em atividades passadas, revisando MySQL e exercícios de Java usando POO! Força, Fé e Foco ò_ó";
	}
	
}
