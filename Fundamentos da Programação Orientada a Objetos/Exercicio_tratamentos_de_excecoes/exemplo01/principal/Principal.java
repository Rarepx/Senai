package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidade.Livro;

public class Principal {

	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		
		try {
			exercutarPrograma(lerDados);
		}catch (Exception e) {
			System.err.println("Falha na execução do método.");
		}finally {
			lerDados.close();
		}
	}
	
	/**
	 * Carrega em tela as opções do menu para o usuário
	 * sendo  1 - cadastra, 2 - exibeInfo ou 3 - sair do programa
	 * o laço se repete enquanto a opção digitada for diferente de 3
	 */
	public static void exercutarPrograma(Scanner lerDados) {
		int opcao;
		Livro livro = null;
		
		do {
			opcao = exibirMenu(lerDados);

			switch (opcao) {
			case 1:
				livro = cadastrarLivro(livro, lerDados);
				break;

			case 2:
				exibirInformacoesLivro(livro);
				break;

			case 3:
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (opcao != 3);
	}

	private static int exibirMenu(Scanner lerDados) {
		int opcao;

		System.out.println("\nMenu de Opções:");
		System.out.println("1. Cadastrar Livro");
		System.out.println("2. Exibir Informações do Livro");
		System.out.println("3. Sair");
		System.out.print("Escolha uma opção: ");

		opcao = lerDados.nextInt();
		lerDados.nextLine();
		return opcao;
	}

	private static Livro cadastrarLivro(Livro livro, Scanner lerDados) {
		String nome, autor, editora;
		int numeroIdentificacao;
		boolean permanecerNoLoop = true;

		do {
			try {
				System.out.println("\n-- Cadastrar Livro --");
				System.out.print("Digite o nome do livro: ");
				nome = lerDados.nextLine();
				
				System.out.print("Digite o autor do livro: ");
				autor = lerDados.nextLine();

				System.out.print("Digite o número de identificação do livro: ");
				numeroIdentificacao = lerDados.nextInt();
				lerDados.nextLine();

				System.out.print("Digite a editora do livro: ");
				editora = lerDados.nextLine();

				livro = new Livro(nome, autor, numeroIdentificacao, editora);
				System.out.println("Livro cadastrado com sucesso!");
				permanecerNoLoop = false;
			
			} catch (NullPointerException e) {
				System.err.println("Livro não pode ser nulo.");
			} catch (InputMismatchException e) {
				System.err.println("Erro durante o cadastro do livro: O Id deve ser um valor inteiro e não uma String.");
			}
			catch (Exception e) {
				System.err.println("Erro durante o cadastro do livro: " + e.getMessage());
			}
		} while (permanecerNoLoop);

		return livro;
	}

	private static void exibirInformacoesLivro(Livro livro) {
		try {
			livro.exibirInformacoes();
		} 
		catch (NullPointerException e) {
			System.err.println("\nNenhum livro cadastrado.");
		}
	}
	
//	private static void exibirInformacoesLivro(Livro livro) {
//		if (livro != null) {
//			livro.exibirInformacoes();
//		} else {
//			System.out.println("\nNenhum livro cadastrado.");
//		}
//	}
}
