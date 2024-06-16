package entidades;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    
    public Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
    }

	@Override
	public String toString() {
		return "nome: " + nome + ", idade: " + idade + ", matricula: " + matricula + "]";
	}
    
    
}
