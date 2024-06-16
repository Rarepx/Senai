package entidades;

import java.util.ArrayList;

public class GerenciarFuncionarios {
	private ArrayList<Funcionario> listaFuncionarios;

	public GerenciarFuncionarios() {
		listaFuncionarios = new ArrayList<Funcionario>();
	}

	public void adicionarFuncionario(Funcionario funcionario) throws NullPointerException {
		listaFuncionarios.add(funcionario);
	}

	public void removerFuncionario(String cpf) {
		if (!listaFuncionarios.isEmpty()) {
			for (int i = 0; i < listaFuncionarios.size(); i++) {
				if(listaFuncionarios.get(i).getCpf().equals(cpf)){
					listaFuncionarios.remove(listaFuncionarios.get(i));
				}
			}
		}
	}

	public void listarFuncionarios() {
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario.toString());
		}
	}

	public void editarInformacoes(String cpf, Funcionario funcionario) throws NullPointerException {
		if (!listaFuncionarios.isEmpty()) {
			for (int i = 0; i < listaFuncionarios.size(); i++) {
				if(listaFuncionarios.get(i).getCpf().equals(cpf)){
					listaFuncionarios.set(i, funcionario);
				}
			}
		}
	}

}