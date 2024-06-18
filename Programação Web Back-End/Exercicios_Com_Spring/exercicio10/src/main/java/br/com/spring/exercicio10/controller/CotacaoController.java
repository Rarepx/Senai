package br.com.spring.exercicio10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CotacaoController {

    @GetMapping("/compra")
    public String obterCotacaoCompraDolarReal() {
        return obterCotacaoPorTipo("bid");
    }

    @GetMapping("/venda")
    public String obterCotacaoVendaDolarReal() {
        return obterCotacaoPorTipo("ask");
    }

    @GetMapping("/min")
    public String obterCotacaoMinimaDolarReal() {
        return obterCotacaoPorTipo("low");
    }

    @GetMapping("/max")
    public String obterCotacaoMaximaDolarReal() {
        return obterCotacaoPorTipo("high");
    }

    @GetMapping("/all")
    public String obterTodasCotacoesDolarReal() {
        return obterCotacaoPorTipo("all");
    }

    private String obterCotacaoPorTipo(String tipo) {
        // Cria uma instância de RestTemplate para fazer requisições HTTP.
        RestTemplate restTemplate = new RestTemplate();

        // Define a URL da API de cotação.
        String url = "https://economia.awesomeapi.com.br/json/last/USD-BRL";

        try {
            // Faz uma requisição GET para a URL especificada e recupera a resposta.
            String resposta = restTemplate.getForObject(url, String.class);
            
            try {
            	if (tipo.equals("all")) {
            		return resposta;
            	} else {
            		// Cria um objeto ObjectMapper para mapear o JSON
                    ObjectMapper objectMapper = new ObjectMapper();

                    // Lê o JSON e obtém a raiz do nó
                    JsonNode rootNode = objectMapper.readTree(resposta);

                    // Obtém o campo 'USDBRL' e o campo especificado na URL (como bid, ask, high, etc.)
                    JsonNode campoNode = rootNode.get("USDBRL").get(tipo);

                    // Retorna o valor do campo como uma string
                    return campoNode.asText();
            	}
            } catch (Exception e) {
                e.printStackTrace();
                return "Erro ao obter o valor: " + e.getMessage();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter a cotação: " + e.getMessage();
        }
    }
}

