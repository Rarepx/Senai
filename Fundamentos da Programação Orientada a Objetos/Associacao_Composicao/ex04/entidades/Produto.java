package entidades;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;
    private int identificacao;


    public Produto(String nome, float preco, int quantidade, int identificacao) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.identificacao = identificacao;
    }
    
    public int getIdentificacao() {
        return identificacao;
    }
	
    public String toString() {
        return "Produto [identificacao=" + identificacao + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
