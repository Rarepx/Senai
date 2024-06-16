package entidades;

public class Produto {
    private String nome;
    private int quantidade;
    private int codigo;
    private double preco;

    public Produto(String nome, int quantidade, int codigo, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", codigo=" + codigo + ", preco=" + preco + "]";
    }
}
