package br.com.exercicio12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/IBGE")
public class IBGEController {
	@GetMapping("/estado/{sigla}")
	public String buscaCidadePorEstado(@PathVariable String sigla) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/" + sigla + "/distritos/";

        try {
            String resposta = restTemplate.getForObject(url, String.class);
            return resposta;
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao consultar o CEP: " + e.getMessage();
        }
    }
	
	@GetMapping("/cidade/{id}")
	public String buscaCidadePorId(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://servicodados.ibge.gov.br/api/v1/localidades/distritos/" + id;

        try {
            String resposta = restTemplate.getForObject(url, String.class);
            return resposta;
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao consultar o CEP: " + e.getMessage();
        }
    }
}

