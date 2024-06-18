package br.com.exercicio05.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/inverter/{texto}")
    public String inverterTexto(@PathVariable String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    @GetMapping("/contar/{texto}")
    public int contarCaracteres(@PathVariable String texto) {
        return texto.length();
    }

    @GetMapping("/converter/maiuscula/{texto}")
    public String converterParaMaiuscula(@PathVariable String texto) {
        return texto.toUpperCase();
    }

    @GetMapping("/converter/minuscula/{texto}")
    public String converterParaMinuscula(@PathVariable String texto) {
        return texto.toLowerCase();
    }
}
