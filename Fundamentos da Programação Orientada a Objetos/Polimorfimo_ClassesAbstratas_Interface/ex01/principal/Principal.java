package principal;

import entidades.Aluno;
import entidades.Professor;

public class Principal {
	 public static void main(String[] args) {
	        Aluno aluno = new Aluno("Carlos", 19, new String[]{"FPOO", "LM"}, 1);
	        System.out.println("Informacoes do aluno: ");
	        aluno.exibirInformacoes();
	        aluno.estudar();
	        
	        System.out.println("\nInformacoes do professor: ");
	        Professor professor1 = new Professor("Eduardo", 37, new String[]{"Turma 1", "Turma 2"}, 2);
	        professor1.exibirInformacoes();
	        professor1.ensinar();
	    }
}
