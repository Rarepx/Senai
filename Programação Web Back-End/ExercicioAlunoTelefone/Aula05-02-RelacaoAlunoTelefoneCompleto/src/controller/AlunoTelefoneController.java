package controller;

import java.util.List;

import dao.AlunoTelefoneDao;
import model.Aluno;
import model.AlunoTelefone;
import view.AlunoTelefoneView;

public class AlunoTelefoneController {
    private AlunoTelefoneDao alunoTelefoneDao;
    private AlunoTelefoneView alunoTelefoneView;

    public AlunoTelefoneController() {
    	alunoTelefoneDao = new AlunoTelefoneDao();
    	alunoTelefoneView = new AlunoTelefoneView();
    }

    public void adicionaTelefone(Aluno aluno, String telefone) {
        AlunoTelefone alunoTelefone = new AlunoTelefone(0, aluno, telefone);

        alunoTelefoneView.exibeInsereAlunoTelefone(alunoTelefoneDao.insereTelefone(alunoTelefone));
    }
    
    public void exibeAlunoTelefone(int id_aluno) {
		List<AlunoTelefone> telefones = alunoTelefoneDao.buscaTelefonePorIdAluno(id_aluno);

		alunoTelefoneView.exibeTelefone(telefones);
	}
}
