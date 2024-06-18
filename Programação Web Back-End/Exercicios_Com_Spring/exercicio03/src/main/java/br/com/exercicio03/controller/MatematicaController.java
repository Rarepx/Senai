package br.com.exercicio03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatematicaController {

    @GetMapping("/soma/{num1}/{num2}")
    public int soma(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/subtracao/{num1}/{num2}")
    public int subtracao(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    @GetMapping("/multiplicacao/{num1}/{num2}")
    public int multiplicacao(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    @GetMapping("/divisao/{num1}/{num2}")
    public String divisao(@PathVariable int num1, @PathVariable int num2) {
        if (num2 == 0) {
            return "Impossível dividir por zero";
        } else {
            return String.valueOf(num1 / num2);
        }
    }
}

