package entidades;

public class Produto {
    private String nome;
    private double preco;
    private Categoria categoria;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, Categoria categoria, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "\nProduto \nNome: " + nome + ", Preço: " + preco + ", Categoria: " + categoria.getNome() + ", Quantidade em Estoque: " + quantidadeEmEstoque;
    }
}
