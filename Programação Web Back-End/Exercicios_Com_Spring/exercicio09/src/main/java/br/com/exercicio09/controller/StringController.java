package br.com.exercicio09.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

	@GetMapping("/concatenar/{nome}/{sobrenome}")
	public String concatenar(@PathVariable String nome, @PathVariable String sobrenome) {
        return "Nome: " + nome + " " + sobrenome;
    }
	
	@GetMapping("/contar/{texto}")
	public String contar(@PathVariable String texto) {
        return "Número de caracteres: " + texto.length();
    }
	
	@GetMapping("/inverter/{texto}")
	public String inverter(@PathVariable String texto) {
		return new StringBuilder(texto).reverse().toString();
    }
	
	@GetMapping("/maiuscula/{texto}")
	public String maiuscula(@PathVariable String texto) {
		return texto.toUpperCase();
    }
}
