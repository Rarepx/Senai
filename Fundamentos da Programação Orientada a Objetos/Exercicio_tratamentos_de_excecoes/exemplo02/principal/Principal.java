package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Biblioteca;
import entidades.Livro;

public class Principal {

	private static int exibirMenu(Scanner lerDados) {
		int opcao;

		System.out.println("Menu de Opcoes:");
		System.out.println("1. Cadastrar Livro");
		System.out.println("2. Remover Livro");
		System.out.println("3. Listar Livros");
		System.out.println("4. Sair");
		System.out.print("Escolha uma opcao: ");

		opcao = lerDados.nextInt();
		lerDados.nextLine();

		return opcao;
	}

	public static void exercutarPrograma(Scanner lerDados, Biblioteca biblioteca) {
		int opcao;
		Livro livro = null;

		do {
			opcao = exibirMenu(lerDados);
			switch (opcao) {
			case 1:
				livro = adicionarDadosEmLivro(livro, lerDados);
				biblioteca.adicionarLivro(livro);
				break;

			case 2:
				biblioteca.removerLivro(livro);
				break;

			case 3:
				biblioteca.listarLivros();
				break;

			case 4:
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opcao invalida. Tente novamente.");
				break;
			}

			System.out.println();
		} while (opcao != 4);
	}

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner lerDados = new Scanner(System.in);

//		try {
//			exercutarPrograma(lerDados, biblioteca);
//		} catch (Exception e) {
//			System.err.println("Falha na execucao do metodo.");
//		} finally {
//			lerDados.close();
//		}
//		
		exercutarPrograma(lerDados, biblioteca);
		lerDados.close();
	}

	private static Livro adicionarDadosEmLivro(Livro livro, Scanner lerDados) {
		String nome, autor, editora;
		int numeroIdentificacao = 0;
		boolean verificaSeNumero = false;

		try {
			System.out.println("\nCadastro de Livro");
			System.out.print("Digite o nome do livro: ");
			nome = lerDados.nextLine();

			System.out.print("Digite o autor do livro: ");
			autor = lerDados.nextLine();

			do {
				try {
					System.out.print("Digite o numero de identificacao do livro: ");
					numeroIdentificacao = lerDados.nextInt();
					verificaSeNumero = true;
				} catch (InputMismatchException e) {
					lerDados.nextLine(); // Limpar o buffer do scanner
					System.err.println("Numero Id invalida. Digite um numero inteiro.");
				}
			} while (!verificaSeNumero);

			lerDados.nextLine(); // Limpar o buffer do scanner

			System.out.print("Digite a editora do livro: ");
			editora = lerDados.nextLine();

			livro = new Livro(nome, autor, numeroIdentificacao, editora);

		} catch (NullPointerException e) {
			System.out.println("Erro o objeto Livro não pode ser nulo: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Erro durante o cadastro do livro: " + e.getMessage());
		}

		return livro;
	}
}
