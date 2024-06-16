package entidades;

public class Produto {
    private int codigo;
    private String descricao;
    private TipoProduto tipo;
    private int quantidade;

    public Produto(int codigo, String descricao, TipoProduto tipo, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

	@Override
	public String toString() {
		return "\nProduto: "
				+ "\n Codigo: " + codigo + 
				  "\n Descricao: " + descricao + 
				  "\n Tipo: " + tipo + 
				  "\n Quantidade: " + quantidade;
	}
    
    
}
