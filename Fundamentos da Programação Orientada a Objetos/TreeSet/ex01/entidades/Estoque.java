package entidades;

import java.util.Iterator;
import java.util.TreeSet;

public class Estoque {
    private TreeSet<Produto> produtos;

    public Estoque() {
        produtos = new TreeSet<>();
    }

    public boolean adicionarProduto(Produto produto) {
        return produtos.add(produto);
    }

    public boolean removerProduto(int codigo) {
        Iterator<Produto> iterator = produtos.iterator();

        while (iterator.hasNext()) {
            Produto produto = iterator.next();

            if (produto.getCodigo() == codigo) {
                iterator.remove();
                return true;
            }
        }

        return false;
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
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
}