package br.com.exercicio11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CepController {
    @GetMapping("/cep/{cep}")
    public String consultarCep(@PathVariable String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            String resposta = restTemplate.getForObject(url, String.class);
            return resposta;
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao consultar o CEP: " + e.getMessage();
        }
    }
    
    @GetMapping("/cep/{campo}/{cep}")
    public String consultarCampo(@PathVariable String campo, @PathVariable String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            String resposta = restTemplate.getForObject(url, String.class);
            return extrairCampo(resposta, campo);
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao consultar o campo " + campo + " do CEP: " + e.getMessage();
        }
    }
    
    private String extrairCampo(String resposta, String campo) {
        try {
        	// Cria um objeto ObjectMapper para mapear o JSON
            ObjectMapper objectMapper = new ObjectMapper();

            // Lê o JSON e obtém a raiz do nó
            JsonNode rootNode = objectMapper.readTree(resposta);

            // Obtém o campo 'logradouro'
            String conteudo_campo = rootNode.get(campo).asText();
            
            // Retorno
            //return campo + ": " + conteudo_campo; // Retorno Original: Ex: Logradouro: Rua Candido Padim
            return conteudo_campo; // Retorno, Ex: Rua Candido Padim
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao o CEP: " + e.getMessage();
        }
    }
}

