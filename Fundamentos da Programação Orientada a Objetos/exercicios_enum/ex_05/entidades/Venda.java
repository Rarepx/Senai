package entidades;

public class Venda {
    private TipoProduto tipo;
    private int quantidade;

    public Venda(TipoProduto tipo, int quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public double finalizarVenda(TipoProduto tipoProduto, int quantidadeProduto) {
    	double valorTotal;
    	
    	valorTotal = quantidade * tipo.getPreco();
    	return  valorTotal;
    }
}