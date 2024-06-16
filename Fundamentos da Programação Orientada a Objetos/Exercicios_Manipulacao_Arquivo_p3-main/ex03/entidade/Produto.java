package entidade;

public class Produto {
	 private int codigo;
	    private int quantidade;
	    private String nome;
	    private String tamanho;
	    private double valor;

	    public Produto(int codigo, int quantidade, String nome, String tamanho, double valor) {
	        this.codigo = codigo;
	        this.quantidade = quantidade;
	        this.nome = nome;
	        this.tamanho = tamanho;
	        this.valor = valor;
	    }

	    @Override
	    public String toString() {
	        return "Produto[" +
	                " Codigo: " + codigo +
	                ", Quantidade: " + quantidade +
	                ", Nome: " + nome + 
	                ", Tamanho: " + tamanho + 
	                ", Valor: " + valor +
	                " ]";
	    }
}
