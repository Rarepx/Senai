package entidades;

import java.util.ArrayList;

public class Supermercado {
    private ArrayList<Produto> produtos;

    public Supermercado() {
        produtos = new ArrayList<>();
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public void remover(Produto produto) {
        produtos.remove(produto);
    }

    public void listar() {
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }

    public ArrayList<Produto> listarPorCategoria(Categoria categoria) {
        ArrayList<Produto> produtosPorCategoria = new ArrayList<>();
        
        for (Produto produto : produtos) {
            if (produto.getCategoria() == categoria) {
                produtosPorCategoria.add(produto);
            }
        }
        return produtosPorCategoria;
    }

    public double venderProduto(String nomeProduto, int quantidadeDesejada) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                if (produto.getQuantidadeEmEstoque() >= quantidadeDesejada) {
                    double valorTotal;
                    
                    valorTotal = produto.getPreco() * quantidadeDesejada;
                    produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeDesejada);
                    return valorTotal;
                } else {
                    System.out.println("O produto não está disponível em quantidade suficiente.");
                    break;
                }
            }
        }
        System.out.println("O produto não foi encontrado.");
        return 0;
    }
}
