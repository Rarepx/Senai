package principal;

import entidades.Aluno;
import entidades.Turma;

public class principal {
	public static void main(String[] args) {
	   Aluno aluno = new Aluno("Pedro", 19, 1234567);
           Turma turma = new Turma("FPOO", "Carlos", aluno);
           
           System.out.println(turma.toString());
	}
}
