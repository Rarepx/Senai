package entidades;

import java.util.Calendar;

public class Aluno {
	  	private String nome;
	    private int matricula;
	    private int idade;
	    private Calendar dataInicioCurso;

	    public Aluno(String nome, int matricula, int idade, Calendar dataInicioCurso) {
	        this.nome = nome;
	        this.matricula = matricula;
	        this.idade = idade;
	        //Calendar: meses de 0 - 11
	        int mes = dataInicioCurso.get(Calendar.MONTH) + 1;
	    	dataInicioCurso.set(Calendar.MONTH, mes);
	    	this.dataInicioCurso = dataInicioCurso;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(int matricula) {
	        this.matricula = matricula;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public Calendar getDataInicioCurso() {
	        return dataInicioCurso;
	    }

	    public void setDataInicioCurso(Calendar dataInicioCurso) {
	    	int mes = dataInicioCurso.get(Calendar.MONTH) + 1;
	    	dataInicioCurso.set(Calendar.MONTH, mes);
	    	this.dataInicioCurso = dataInicioCurso;
	    }

		@Override
		public String toString() {
			return "Aluno [Nome: " + nome + 
					", Matricula: " + matricula + 
					", Idade: " + idade + 
					", dataInicioCurso: " + dataInicioCurso.get(Calendar.DATE)+"/"+
					dataInicioCurso.get(Calendar.MONTH)+"/"+
					dataInicioCurso.get(Calendar.YEAR)+ "]";
		}
	    
	    
}
