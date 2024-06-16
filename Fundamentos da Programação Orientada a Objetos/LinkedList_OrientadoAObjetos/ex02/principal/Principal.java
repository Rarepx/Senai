package principal;

import java.util.Scanner;

import entidades.Agenda;
import entidades.Contato;

public class Principal {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner lerDados = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println(" ___MENU___ ");
			System.out.println("1 - Adicionar contato");
			System.out.println("2 - Remover contato");
			System.out.println("3 - Buscar contato");
			System.out.println("4 - Listar contatos");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			opcao = lerDados.nextInt();
			lerDados.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				String nome = lerDados.nextLine();
				System.out.print("Telefone: ");
				String telefone = lerDados.nextLine();
				System.out.print("E-mail: ");
				String email = lerDados.nextLine();
				Contato novoContato = new Contato(nome, telefone, email);
				agenda.adicionarContato(novoContato);
				System.out.println("Contato adicionado com sucesso!");
				break;

			case 2:
				System.out.print("Nome: ");
				nome = lerDados.nextLine();
				boolean removido = agenda.removerContato(nome);
				if (removido) {
					System.out.println("Contato removido com sucesso!");
				} else {
					System.out.println("Contato não encontrado.");
				}
				break;

			case 3:
				System.out.print("Nome: ");
				nome = lerDados.nextLine();
				Contato contatoEncontrado = agenda.buscarContato(nome);
				if (contatoEncontrado != null) {
					System.out.println("Nome: " + contatoEncontrado.getNome());
					System.out.println("Telefone: " + contatoEncontrado.getTelefone());
					System.out.println("E-mail: " + contatoEncontrado.getEmail());
				} else {
					System.out.println("Contato não encontrado.");
				}
				break;

			case 4:
				agenda.listarContatos();
				break;

			case 0:
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			System.out.println();
		}
		lerDados.close();
	}
}
