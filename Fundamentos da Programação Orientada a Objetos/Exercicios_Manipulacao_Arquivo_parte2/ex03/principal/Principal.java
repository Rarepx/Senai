package principal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import entidade.Produto;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		try {
			FileInputStream fileInputStream = new FileInputStream("arquivo.csv");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			String linha = "";
			int i;
			
			while ((i = bufferedInputStream.read()) != -1) {
				if (i == '\n') {
					String[] dados = linha.split(", ");
					int codigo = Integer.parseInt(dados[0]);
					int quantidade = Integer.parseInt(dados[1]);
					String nome = dados[2];
					String tamanho = dados[3];
					double valor = Double.parseDouble(dados[4]);

					Produto produto = new Produto(codigo, quantidade, nome, tamanho, valor);
					produtos.add(produto);

					linha = "";
				} else {
					linha = (linha + (char) i);
				}
			}
			bufferedInputStream.close();
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		System.out.println("Conteúdo do arquivo:");
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
