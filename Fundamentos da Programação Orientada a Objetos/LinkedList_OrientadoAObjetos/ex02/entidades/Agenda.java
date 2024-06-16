package entidades;

import java.util.LinkedList;

public class Agenda {
	private LinkedList<Contato> contatos;

	public Agenda() {
		contatos = new LinkedList<Contato>();
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public boolean removerContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equals(nome)) {
				contatos.remove(contato);
				return true;
			}
		}
		return false;
	}

	public Contato buscarContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equals(nome)) {
				return contato;
			}
		}
		return null;
	}

	public void listarContatos() {
		System.out.println("\nLista de contatos:");
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("E-mail: " + contato.getEmail());
			System.out.println("--------------------");
		}
	}
}