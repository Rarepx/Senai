package entidades;

import java.util.LinkedList;

public class Loja {
    private LinkedList<Produto> produtos;

    public Loja() {
        produtos = new LinkedList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    
    public void listarProdutos() {
    	for (Produto produto : produtos) {
    		System.out.println(produto.toString());
    	}
    }
    
    public LinkedList<Produto> getProdutosPorTipo(TipoProduto tipo) {
        LinkedList<Produto> produtosPorTipo = new LinkedList<>();

        for (Produto produto : produtos) {
            if (produto.getTipo() == tipo) {
                produtosPorTipo.add(produto);
            }
        }

        return produtosPorTipo;
    }

    public boolean venderProduto(TipoProduto tipo, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getTipo() == tipo && produto.getQuantidade() >= quantidade) {
                double valorTotal = quantidade * produto.getTipo().getPreco();
                System.out.printf("Venda realizada com sucesso! Total: R$ %.2f\n", valorTotal);
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                return true;
            }
        }

        System.out.println("Nao foi possível realizar a venda.");
        return false;
    }
}
