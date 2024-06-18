package br.com.exercicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/aluno/{aluno}/{idade}")
	public String aluno1(@PathVariable String aluno, @PathVariable int idade) {
		return aluno + " tem " + idade + " anos";
	}
	
	@GetMapping("/aluno")
	public String aluno2(@RequestParam int idade, @RequestParam String aluno) {
		return aluno + " tem " + idade + " anos";
	}
}
