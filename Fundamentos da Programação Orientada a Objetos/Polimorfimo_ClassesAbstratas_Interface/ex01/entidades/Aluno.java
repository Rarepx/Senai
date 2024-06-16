package entidades;

public class Aluno extends Pessoa {
	private String[] disciplinas;
	private int id;

	public Aluno(String nome, int idade, String[] disciplinas, int id) {
		super(nome, idade);
		this.disciplinas = disciplinas;
		this.id = id;
	}

	public void estudar() {
		System.out.println("Estou estudando!");
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		
		System.out.printf("Numero de identificação: %d \n",id);
		
		System.out.print("Disciplinas: ");
		for (String disciplina : disciplinas) {
			System.out.print(disciplina + " ");
		}
		System.out.println();
	}
}