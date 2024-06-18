package br.com.exercicio04.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoedaController {

    // Simulando a taxa de câmbio
    double taxaCambio = 5.0;

    @GetMapping("/converter/{moeda}/{valor}")
    public String converterMoeda(@PathVariable String moeda, @PathVariable double valor) {
        if (moeda.equalsIgnoreCase("real")) {
            double valorConvertido = valor / taxaCambio;
            return "O valor em Dólares é: " + valorConvertido;
        } else if (moeda.equalsIgnoreCase("dolar")) {
            double valorConvertido = valor * taxaCambio;
            return "O valor em Reais é: " + valorConvertido;
        } else {
            return "Moeda inválida. Escolha entre 'real' ou 'dolar'.";
        }
    }
}

