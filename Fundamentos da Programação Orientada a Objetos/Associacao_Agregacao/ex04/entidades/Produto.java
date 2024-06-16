package entidades;

public class Produto {
    private int identificacao;
    private String nome;
    private String descricao;

    public Produto(int identificacao, String nome, String descricao) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto[" +
                "identificacao: " + identificacao +
                ", nome: '" + nome + '\'' +
                ", descricao: '" + descricao + '\'' +
                ']';
    }
}
