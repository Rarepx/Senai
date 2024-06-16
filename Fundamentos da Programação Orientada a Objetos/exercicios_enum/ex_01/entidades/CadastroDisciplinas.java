package entidades;

//Classe CadastroDisciplinas
import java.util.ArrayList;

public class CadastroDisciplinas {
	private ArrayList<Disciplina> disciplinas;

	// Construtor
	public CadastroDisciplinas() {
		this.disciplinas = new ArrayList<>();
	}

	// Método para cadastrar uma disciplina
	public void cadastrarDisciplina(Disciplina disciplina) {
		if (disciplinas.contains(disciplina)) {
			System.out.println("Disciplina já cadastrada!");
		} else if (!isTipoDisciplinaValida(disciplina.getTipo())) {
			System.out.println("Tipo de disciplina inválido!");
		} else {
			disciplinas.add(disciplina);
			System.out.println("Disciplina cadastrada com sucesso!");
		}
	}

	// Método para remover uma disciplina
	public void removerDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}

	// Método para listar todas as disciplinas cadastradas
	public void listarDisciplinas() {
		if (disciplinas.isEmpty()) {
			System.out.println("Não há disciplinas cadastradas!");
		} else {
			System.out.println("Disciplinas cadastradas:");
			for (Disciplina disciplina : disciplinas) {
				System.out.println(disciplina.getPeriodo() + " - " + disciplina.getTipo()+ " - " + disciplina.getTipo().getDescricao());
			}
		}
	}

	// Método para verificar se o tipo de disciplina é válido
	private boolean isTipoDisciplinaValida(TipoDisciplina tipoDisciplina) {
		for (TipoDisciplina tipo : TipoDisciplina.values()) {
			if (tipo == tipoDisciplina) {
				return true;
			}
		}
		return false;
	}
}
