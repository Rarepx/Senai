package main;

import java.util.Scanner;


import controller.TarefaController;
import model.Tarefa;
import model.Tarefa.Status;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Cria um objeto TarefaController para nos auxiliar na criação e exibição de
		 * dados referentes as tarefas
		 */
		TarefaController tarefaController = new TarefaController();

		// Cria um objeto scanner para ler as entradas de teclado no console
		Scanner scanner = new Scanner(System.in);

		// Variavel de controle para nossa estrutura de repetição
		int opcao = -1;

		// Estrutura de repetição - Repete o laço enquando o usuário não digitar a opção
		// "0" - sair do sistema
		while (opcao != 0) {

			// Menu da nossa aplicação
			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar tarefa");
			System.out.println("2. Exibir todas tarefas");
			System.out.println("3. Excluir tarefa"); 
			System.out.println("4. Finalizar tarefa"); 
			System.out.println("5. Editar tarefa"); 
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			
			/*
			 *  Estrutura try-catch
			 *  No bloco try, colocamos o trecho de código que pode lançar uma exceção,
			 *  em outras palavras, colocomos o trecho do código que pode dar algum problema (bug).
			 *  Exemplo: ler um número inteiro "scanner.nextInt()", porém o usuário digita uma letra.
			 *  Nesse momento, o sistema tentará converter uma letra (string) em número inteiro. 
			 */
			try {

				// Lê a opção de menu que foi digitada pelo usuário
				opcao = scanner.nextInt();
	
				// Estrutura condicional - Verifica o conteúdo da variável opcao
				switch (opcao) {
	
				// Opção do Menu 1 - Adicionar país
				case 1:
					
					// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
					System.out.print("Digite o título da tarefa: ");
					// Consumir o '\n' após a leitura do número
					scanner.nextLine();
					// Cria uma String titulo que armazena o titulo da tarefa que o usuário digitou no console
					String titulo = scanner.nextLine();
	
					// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
					System.out.print("Digite a descrição da tarefa: ");
					// Cria uma String descricao que armazena a descricao da tarefa que o usuário digitou no console
					String descricao = scanner.nextLine();
	
					// Utiliza o método adicionaTarefa do objeto tarefaController
					tarefaController.adicionaTarefa(titulo, descricao, Tarefa.Status.A);
					break;

				case 2:
					// Utiliza o método listaTarefa do objeto tarefaController
					tarefaController.listaTarefa();
					break;
	
				case 3:
					System.out.println(" - - -  Modo excluir tarefa  - - -  ");
					System.out.println(" -      Exibindo a lista de      -  ");
					System.out.println(" -            tarefas            -  ");
					// Utiliza o método listaTarefa do objeto tarefaController
					tarefaController.listaTarefa();
					
					// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
					System.out.println("Digite o ID da tarefa que deseja excluir: ");
					// Consumir o '\n' após a leitura do número
					scanner.nextLine();
					// Cria um int id_tarefa_exclui que armazena o id_tarefa da tarefa que o usuário digitou no console
					int id_tarefa_exclui = scanner.nextInt();
	
					// Utiliza o método excluiTarefa do objeto tarefaController
					tarefaController.excluiTarefa(id_tarefa_exclui);
					break;

				case 4:
					System.out.println(" - - - Modo finalizar tarefa - - -  ");
					System.out.println(" -      Exibindo a lista de      -  ");
					System.out.println(" -            tarefas            -  ");
					// Utiliza o método listaTarefa do objeto tarefaController
					tarefaController.listaTarefa();
					
					// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
					System.out.println("Digite o ID da tarefa que deseja finalizar: ");
					// Consumir o '\n' após a leitura do número
					scanner.nextLine();
					// Cria um int id_tarefa_finaliza que armazena o id_tarefa da tarefa que o usuário digitou no console
					int id_tarefa_finaliza = scanner.nextInt();
	
					// Utiliza o método finalizaTarefa do objeto tarefaController
					tarefaController.finalizaTarefa(id_tarefa_finaliza);
					break;
					
				case 5:
					System.out.println(" - - -  Modo alterar tarefa  - - -  ");
					System.out.println(" -      Exibindo a lista de      -  ");
					System.out.println(" -            tarefas            -  ");
					// Utiliza o método listaTarefa do objeto tarefaController
					tarefaController.listaTarefa();
					
					// Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
					System.out.println("Digite o ID da tarefa que deseja alterar: ");
					// Consumir o '\n' após a leitura do número
					scanner.nextLine();
					// Cria um int id_tarefa_finaliza que armazena o id_tarefa da tarefa que o usuário digitou no console
					int id_tarefa_atualiza = scanner.nextInt();
					
					
	
					
					// Cria uma String titulo que armazena o titulo da tarefa que o usuário digitou no console
					System.out.print("Digite o título da tarefa: ");
					// Cria uma String titulo_atualiza que armazena o titulo da tarefa que o usuário digitou no console
			        String titulo_atualiza = scanner.nextLine();
			        
			        // Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
					System.out.print("Digite a descrição da tarefa: ");
					// Cria uma String descricao_atualiza que armazena a descricao da tarefa que o usuário digitou no console
			        String descricao_atualiza = scanner.nextLine();

			        // Escreva no console a mensagem informativa para o usuário saber o que o sistema está esperando que ele digite
			        System.out.print("Digite o status da tarefa (A/P/C): ");
			        // Cria um Status (enum) status_atualiza que armazena o status da tarefa que o usuário digitou no console
			        Status status_atualiza = Status.valueOf(scanner.nextLine());
			        
			        
			        tarefaController.atualizaTarefa(id_tarefa_atualiza, titulo_atualiza, descricao_atualiza, status_atualiza);
					break;
					
				case 0:
					// Exibe mensagem informativa avisando o usuário que o sistema será finalizado
					System.out.println("Saindo...");
					break;
	
				default:
					// Exibe mensagem informativa avisando o usuário que ele digitou uma opção que não existe no menu
					System.out.println("Opção inválida.");
					break;
				}
			} 
			
			/*
			 * Estrutura try-catch
			 * No bloco catch colocamos o tratamento da exceção.
			 * Em outras palavras, quando algum erro (exceção) acontecer dentro do bloco try,
			 * o sistema automaticamente para a execução normal, e executa o bloco catch.
			 * Exemplo: na conversão de uma string em número inteiro, o sistema já executa o catch
			 * e escreve no console "Opção inválida...."
			 */
			catch (java.util.InputMismatchException e) {
				System.out.println("Opção inválida. Por favor, digite um número inteiro válido.");
                scanner.nextLine(); // Limpar o buffer do scanner
			}
		}
	}
}
