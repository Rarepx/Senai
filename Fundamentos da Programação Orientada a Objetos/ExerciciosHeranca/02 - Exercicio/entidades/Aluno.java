package entidades;

public class Aluno extends Pessoa {
	private String nomeCurso;

	public Aluno(String nome, int idade, String nomeCurso) {
		super(nome, idade);
		this.nomeCurso = nomeCurso;
	}
	
	@Override
	public void exibirInformacao() {
		super.exibirInformacao();
		System.out.println(this.nomeCurso);
	}

}
