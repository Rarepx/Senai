package entidades;

public class ItemDeLinha {
    private int identificacao;
    private int quantidade;
    private Produto produto;

    public ItemDeLinha(int identificacao, int quantidade, Produto produto) {
        this.identificacao = identificacao;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemDeLinha[" +
                "identificacao: " + identificacao +
                ", quantidade: " + quantidade +
                ", produto: " + produto +
                ']';
    }
}
