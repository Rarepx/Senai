package br.com.exercicio08.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenaiController {

	@GetMapping("/professor/{nome}/{especialidade}/{disciplina}")
	public String professor(@PathVariable String nome, @PathVariable String especialidade, @PathVariable String disciplina) {
        return "Professor: " + nome + ", Especialidade: " + especialidade + ", Disciplina: " + disciplina;
    }
	
	@GetMapping("/aluno/{nome}/{idade}")
	public String aluno(@PathVariable String nome, @PathVariable int idade) {
        return "Aluno: " + nome + ", Idade: " + idade;
    }
	
	@GetMapping("/turma/{nome}/{periodo}")
	public String turma(@PathVariable String nome, @PathVariable String periodo) {
        return "Turma: " + nome + ", Período: " + periodo;
    }
	
	@GetMapping("/escola/{nome}/{cidade}")
	public String escola(@PathVariable String nome, @PathVariable String cidade) {
        return "Escola: " + nome + ", Cidade: " + cidade;
    }
}
