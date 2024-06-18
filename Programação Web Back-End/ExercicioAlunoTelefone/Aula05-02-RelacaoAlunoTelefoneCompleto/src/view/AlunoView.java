package view;

import java.util.List;
import model.Aluno;

public class AlunoView {
	public void exibeAluno(Aluno aluno) {
        if (aluno != null) {
            System.out.print("ID do Aluno: " + aluno.getId_aluno());
            System.out.print(" - ");
            System.out.print("Nome: " + aluno.getNome());
            System.out.print(" - ");
            System.out.println("Idade: " + aluno.getIdade());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void exibeAlunos(List<Aluno> alunos) {
        if (alunos != null) {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
            	exibeAluno(aluno);
            }
        } else {
            System.out.println("Nenhum aluno encontrado.");
        }
    }
    
    public void exibeExcluiAluno(boolean excluiu) {
    	if (excluiu) {
    		System.out.println("O aluno foi excluído com sucesso.");
    	} else {
    		System.out.println("Erro ao excluir o aluno.");
    	}
    }
    
    public void exibeInsereAluno(boolean excluiu) {
    	if (excluiu) {
    		System.out.println("O aluno foi cadastrado com sucesso.");
    	} else {
    		System.out.println("Erro ao cadastrar o aluno.");
    	}
    }
    
    public void exibeAtualizaAluno(boolean atualizou) {
    	if (atualizou) {
    		System.out.println("O aluno foi atualizado com sucesso.");
    	} else {
    		System.out.println("Erro ao atualizar o aluno.");
    	}
    }
}
