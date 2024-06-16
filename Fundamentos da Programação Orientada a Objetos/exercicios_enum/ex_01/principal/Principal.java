package principal;

import entidades.CadastroDisciplinas;
import entidades.Disciplina;
import entidades.TipoDisciplina;

public class Principal {
	 public static void main(String[] args) {
	        CadastroDisciplinas cadastro = new CadastroDisciplinas();

	        Disciplina fpoo = new Disciplina("tarde", TipoDisciplina.FPOO);
	        Disciplina lm = new Disciplina("manha", TipoDisciplina.LM);
	        Disciplina so = new Disciplina("manha", TipoDisciplina.SO);
	        

	        cadastro.cadastrarDisciplina(fpoo);
	        cadastro.cadastrarDisciplina(lm);
	        cadastro.cadastrarDisciplina(so);
	        System.out.println();
	        cadastro.listarDisciplinas();

	        cadastro.removerDisciplina(lm);
	        System.out.println();
	        cadastro.listarDisciplinas();
	 }
}
