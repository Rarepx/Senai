package principal;

import entidades.Estoque;
import entidades.Produto;


public class Principal {
    public static void main(String[] args) {
     
        Produto produto_1 = new Produto(1, "Camisa", 15);
        Produto produto_2 = new Produto(2, "Bone", 10);
        Produto produto_3 = new Produto(3, "Meias", 5);
        
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto_1);
        estoque.adicionarProduto(produto_2);
        estoque.adicionarProduto(produto_3);

        estoque.listarProdutos();
        estoque.removerProduto(2);
        estoque.listarProdutos();

        Produto produto_4 = estoque.buscarProduto(1);
        if (produto_4 != null) {
        	produto_4.setQuantidade(15);
        }

        estoque.listarProdutos();
    }
}
