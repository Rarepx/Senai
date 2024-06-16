package principal;

import entidades.Produto;
import entidades.Estoque;

public class Principal {
     public static void main(String[] args) {
        // Cria produtos
        Produto p1 = new Produto("Caneta", 2.5f, 100, 1);
        Produto p2 = new Produto("Caderno", 10.0f, 50, 2);
        Produto p3 = new Produto("Lápis", 1.5f, 200, 3);
        
        // Gera um array de produtos e adiciona os produtos criados
        Produto[] produtos = {p1, p2, p3};
        
        // Cria o estoque a partir do array de produtos
        Estoque estoque = new Estoque(produtos);
        
        // Adiciona um novo produto ao estoque
        Produto p4 = new Produto("Borracha", 0.5f, 150, 4);
        estoque.adicionarProduto(p4);
        
        // Exibe a lista de todos os produtos do estoque
        estoque.listarProdutos();
        
        // Busca um produto pelo número de identificação
        Produto produtoBuscado = estoque.buscarProduto(2);
        System.out.println("Produto encontrado: " + produtoBuscado);
        
        // Remove um produto do estoque pelo número de identificação 
        estoque.removerProduto(2);
        
        // Exibe novamente a lista de todos os produtos do estoque após a remoção
        estoque.listarProdutos();
    }
        
}
