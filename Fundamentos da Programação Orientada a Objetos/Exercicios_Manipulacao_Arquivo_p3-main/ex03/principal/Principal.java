package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entidade.Produto;

public class Principal {
	public static void main(String[] args) {
        String caminhoArquivoLeitura = "arquivo.csv"; 
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(caminhoArquivoLeitura);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha = null;
            while ((linha = bufferedReader.readLine()) != null) {
                String[] valorCampo = linha.split(","); 

                int codigo = Integer.parseInt(valorCampo[0].trim());
                int quantidade = Integer.parseInt(valorCampo[1].trim());
                String nome = valorCampo[2].trim();
                String tamanho = valorCampo[3].trim();
                double valor = Double.parseDouble(valorCampo[4].trim());

                Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);
                produtos.add(produto); 
            }

            bufferedReader.close(); 
            fileReader.close(); 
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
