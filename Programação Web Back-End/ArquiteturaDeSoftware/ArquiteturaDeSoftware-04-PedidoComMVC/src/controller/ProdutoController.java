package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
    private ProdutoView produtoView;

    public ProdutoController() {
    	produtoView = new ProdutoView();
    }

    public Produto criarProduto(int idProduto, String nome, double preco) {
    	Produto produto = new Produto(idProduto, nome, preco);
        return produto;
    }

    public void exibirDetalhesProduto(Produto produto) {
    	produtoView.exibirProduto(produto);
    }
}
