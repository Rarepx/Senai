package entidades;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManipularProdutos {
	private ArrayList<Produto> produtos;
	
	public ManipularProdutos() {
		produtos = new ArrayList<>();
	}
	
	public void carregarProdutos(String nomeArquivo) {
        try { 
        	FileInputStream fileInputStream = new FileInputStream(nomeArquivo);
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
    }

    public void removerProduto(int codigo) {
        Produto produtoRemover = null;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtoRemover = produto;
                break;
            }
        }

        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
            System.out.println("Produto removido: " + produtoRemover);
        } else {
            System.out.println("Produto com codigo " + codigo + " nao encontrado.");
        }
    }
    
    public void listarProdutos() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
    }

    public void atualizarArquivo(String nomeArquivo) {
        try {
        	FileWriter fileWriter = new FileWriter(nomeArquivo);
        	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
        	
            for (Produto produto : produtos) {
                String linha = produto.getCodigo() + ", " +
                        produto.getQuantidade() + ", " +
                        produto.getNome() + ", " +
                        produto.getTamanho() + ", " +
                        produto.getValor();
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }
            System.out.println("Arquivo atualizado com sucesso!");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
        }
    }
}
