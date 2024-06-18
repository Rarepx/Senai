package controller;

import dao.AlunoDao;
import model.Aluno;
import view.AlunoView;

public class AlunoController {
	private AlunoDao alunoDao;
	private AlunoView alunoView;

	public AlunoController() {
		alunoDao = new AlunoDao();
		alunoView = new AlunoView();
	}

	public void adicionaAluno(String nome, int idade) {
		Aluno aluno = new Aluno(0, nome, idade);

		boolean inseriu = alunoDao.insereAluno(aluno);

		alunoView.exibeInsereAluno(inseriu);
	}

	public void listaAlunos() {
		alunoView.exibeAlunos(alunoDao.listaAlunos());
	}

	public void exibeAluno(int id_aluno) {
		Aluno aluno = alunoDao.buscaAlunoPorId(id_aluno);

		alunoView.exibeAluno(aluno);
	}

	public void excluiAluno(int id_aluno) {
		boolean excluiu = alunoDao.excluiAluno(id_aluno);

		alunoView.exibeExcluiAluno(excluiu);
	}
	
	public Aluno buscaAlunoPorId(int id_aluno) {
		return alunoDao.buscaAlunoPorId(id_aluno);
	}

	public void atualizaAluno(Integer id_aluno,String nome, int idade) {
		Aluno aluno = new Aluno(id_aluno, nome, idade);
		
		boolean atualizou = alunoDao.atualizaAluno(aluno);

		alunoView.exibeAtualizaAluno(atualizou);
	}
}
