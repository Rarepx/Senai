package entidades;

import java.util.HashSet;

public class Estoque {
    private HashSet<Produto> produtos;

    public Estoque() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtos.remove(produto);
                break;
            }
        }
    }

    public Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        System.out.println("\nLista de produtos em estoque:");
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo() +
                    ", Nome: " + produto.getNome() +
                    ", Quantidade: " + produto.getQuantidade());
        }
    }
}
