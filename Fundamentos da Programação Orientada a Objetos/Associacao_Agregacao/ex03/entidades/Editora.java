package entidades;

public class Editora {
	private String nome;
	private int identificacao;
	private String cidade;

	public Editora(String nome, int identificacao, String cidade) {
		this.nome = nome;
		this.identificacao = identificacao;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "\nEditora: " + "Nome: '" + nome + '\'' + ", Identificacao: " + identificacao + ", Cidade: '" + cidade + '\''
				+ "";
	}
}