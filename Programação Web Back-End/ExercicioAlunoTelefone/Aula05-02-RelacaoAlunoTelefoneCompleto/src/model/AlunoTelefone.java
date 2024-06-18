package model;

public class AlunoTelefone {
	private int id_telefone;
	private Aluno aluno;
	private String telefone;
	
	public AlunoTelefone() {}

	public AlunoTelefone(int id_telefone, Aluno aluno, String telefone) {
		this.id_telefone = id_telefone;
		this.aluno = aluno;
		this.telefone = telefone;
	}

	public int getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(int id_telefone) {
		this.id_telefone = id_telefone;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
