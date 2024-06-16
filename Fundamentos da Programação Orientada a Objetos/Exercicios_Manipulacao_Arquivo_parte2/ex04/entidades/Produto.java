package entidades;

public class  Produto {
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", quantidade=" + quantidade + ", nome=" + nome + ", tamanho=" + tamanho
				+ ", valor=" + valor + "]";
	}

    
}
