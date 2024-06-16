package principal;

import entidades.Produto;
import entidades.Estoque;
import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	        Estoque estoque = new Estoque();

	        Produto produto1 = new Produto(1, "Caneta", 5);
	        Produto produto2 = new Produto(2, "Lápis", 2);
	        Produto produto3 = new Produto(3, "Borracha", 1);

	        estoque.adicionarProduto(produto1);
	        estoque.adicionarProduto(produto2);
	        estoque.adicionarProduto(produto3);

	        estoque.listarProdutos();

	        estoque.removerProduto(2);

	        Produto produto4 = estoque.buscarProduto(1);
	        System.out.println(produto4.toString());
	    }
}

