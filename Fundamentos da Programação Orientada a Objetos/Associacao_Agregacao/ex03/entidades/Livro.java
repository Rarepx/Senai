package entidades;

public class Livro {
	private String nome;
	private float preco;
	private Autor autor;
	private Editora editora;

	public Livro(String nome, float preco, Autor autor, Editora editora) {
		this.nome = nome;
		this.preco = preco;
		this.autor = autor;
		this.editora = editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro: " + "Nome: '" + nome + '\'' + ", Preco: " + preco + ", \nAutor: " + autor + ", \nEditora: " + editora
				+ "";
	}
}
