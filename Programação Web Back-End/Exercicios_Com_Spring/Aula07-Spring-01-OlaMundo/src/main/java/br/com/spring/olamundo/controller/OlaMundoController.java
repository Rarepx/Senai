package br.com.spring.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Esta classe é um controlador que trata requisições HTTP relacionadas a mensagens "Olá Mundo".
 * @RestController é uma anotação do Spring que combina a funcionalidade de @Controller e @ResponseBody.
 * Isso significa que os métodos retornam diretamente os dados para o corpo da resposta HTTP.
 */
@RestController
public class OlaMundoController {

    /**
     * Este método trata requisições GET para a raiz ("/") da aplicação.
     * @return Retorna uma mensagem "Olá mundo!" como uma resposta.
     */
    @GetMapping("/")
    public String casa() {
        return "Olá mundo!";
    }
    
    /**
     * Este método trata requisições GET para o caminho ("/ingles").
     * @return Retorna uma mensagem "Hello world!" como uma resposta.
     */
    @GetMapping("/ingles")
    public String home() {
        return "Hello world!";
    }
}
