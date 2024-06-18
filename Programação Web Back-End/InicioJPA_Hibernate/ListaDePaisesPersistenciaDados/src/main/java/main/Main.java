package main;
import java.util.Scanner;
import controller.PaisController;

public class Main {
	public static void main(String[] args) {
		PaisController paisController = new PaisController();
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		
		while (opcao != 0) {

			// Menu da nossa aplicação
			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar pais");
			System.out.println("2. Listar paises");
			System.out.println("3. Buscar pais");
			System.out.println("4. Remover pais da lista");
			System.out.println("5. Atualizar pais");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opcao: ");
			
			try {

				opcao = scanner.nextInt();
	
				switch (opcao) {
	
				case 1:
					System.out.print("Digite o nome do pais: ");
					scanner.nextLine();
					String nome = scanner.nextLine();
	
					System.out.print("Digite a capital do pais " + nome + ": ");
					String capital = scanner.nextLine();
	
					paisController.adicionarPais(nome, capital);
					break;
					
				case 2:
					paisController.listarPaises();
					break;
					
				case 3:
					System.out.print("Digite o nome do pais que deseja buscar: ");
					scanner.nextLine();
					String nomeBusca = scanner.nextLine();
					
					paisController.buscaPaisPorNome(nomeBusca);
					break;
	
				case 4:
					System.out.println("Digite o ID do pais a ser removido: ");

					Integer idPaisRemover = scanner.nextInt();
	
					paisController.removerPais(idPaisRemover);
					break;
					
				case 5:
					System.out.println("Digite o ID do pais que deseja atualizar: ");
					Integer idPaisAtualizar = scanner.nextInt();
					
					System.out.print("Digite o nome do pais: ");
					scanner.nextLine();
					String nomeAtualizar = scanner.nextLine();
	
					System.out.print("Digite a capital do pais " + nomeAtualizar + ": ");
					String capitalAtualizar = scanner.nextLine();
	
					paisController.atualizarPais(idPaisAtualizar, nomeAtualizar, capitalAtualizar);
					break;
	
				case 0:
					System.out.println("Saindo...");
					paisController.fecharPaisDAO();	
					break;
	
				default:
					System.out.println("Opcao invalida.");
					break;
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Opcao invalida. Por favor, digite um numero inteiro valido.");
                		scanner.nextLine();
			}
		}
		
		scanner.close();
	}
}
