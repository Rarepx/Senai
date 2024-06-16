package entidades;

public class Livro {
    private String nome;
    private String autor;
    private int numeroIdentificacao;
    private String editora;

    public Livro(String nome, String autor, int numeroIdentificacao, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.numeroIdentificacao = numeroIdentificacao;
        this.editora = editora;
    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Identificação: " + numeroIdentificacao);
        System.out.println("Editora: " + editora);
    }

	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
    
    
}