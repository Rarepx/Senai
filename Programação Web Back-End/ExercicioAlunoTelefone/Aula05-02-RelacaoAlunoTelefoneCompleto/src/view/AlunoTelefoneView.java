package view;

import java.util.List;

import model.Aluno;
import model.AlunoTelefone;

public class AlunoTelefoneView {
	public void exibeTelefone(List<AlunoTelefone> telefones) {
        if (telefones != null) {
            for (AlunoTelefone telefone : telefones) {
                System.out.println("Telefone: " + telefone.getTelefone());
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    
    public void exibeInsereAlunoTelefone(boolean excluiu) {
    	if (excluiu) {
    		System.out.println("O telefone foi cadastrado com sucesso.");
    	} else {
    		System.out.println("Erro ao cadastrar o telefone.");
    	}
    }
}
