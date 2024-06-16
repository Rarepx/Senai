package entidades;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	private TipoLivro tipo;
	private int qtdExemplares;

	public Livro(String titulo, String autor, String editora, int anoPublicacao, TipoLivro tipo, int qtdExemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.tipo = tipo;
		this.qtdExemplares = qtdExemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public TipoLivro getTipo() {
		return tipo;
	}

	public int getQtdExemplares() {
		return qtdExemplares;
	}

	public void incrementarExemplares(int quantidade) {
		qtdExemplares = qtdExemplares + quantidade;
	}

	public void decrementarExemplares(int quantidade) {
		if (qtdExemplares >= quantidade) {
			qtdExemplares = qtdExemplares - quantidade;
		} else {
			System.out.println("Não é possível remover mais exemplares do que a quantidade atual.");
		}
	}

	@Override
	public String toString() {
		return "\n Livro:"
				+ " Titulo: " + titulo + ", "
				+ " Autor: " + autor + ", "
				+ " Editora: " + editora + ", "
				+ " Ano de Publicacao: " + anoPublicacao + ", "
				+ " Tipo: " + tipo + ", "
			        + " Quantidade de Exemplares: " + qtdExemplares;
	}
	
	
}
