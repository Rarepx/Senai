package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.GerenciarFuncionarios;

public class Principal {
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		GerenciarFuncionarios gerenciarFuncionarios = new GerenciarFuncionarios();
		Funcionario funcionario = null;
		char validar = 'n';

		try {
			int opcao = 0;
			while (opcao != 5) {
				System.out.println("-- Menu --");
				System.out.println("1. Adicionar funcionário");
				System.out.println("2. Remover funcionário");
				System.out.println("3. Listar funcionários");
				System.out.println("4. Editar informações de um funcionário");
				System.out.println("5. Sair");
				System.out.print("Escolha uma opção: ");
				opcao = lerDados.nextInt();

				switch (opcao) {
				case 1:
					lerDados.nextLine(); // Limpar o buffer
					System.out.println("\n Cadastro de Funcionário: ");
					System.out.print("Nome: ");
					String nome = lerDados.nextLine();

					System.out.print("Idade: ");
					int idade = lerDados.nextInt();

					lerDados.nextLine(); // Limpar o buffer
					System.out.print("CPF: ");
					String cpf = lerDados.nextLine();

					System.out.print("Carga Horaria: ");
					double cargaHoraria = lerDados.nextDouble();

					lerDados.nextLine(); // Limpar o buffer
					System.out.print("Descricao da Atividade: ");
					String descricaoAtividade = lerDados.nextLine();

					funcionario = new Funcionario(nome, idade, cpf, cargaHoraria, descricaoAtividade);
					gerenciarFuncionarios.adicionarFuncionario(funcionario);
					break;

				case 2:
					System.out.println("\n Remocao de Funcionario: ");
					System.out.print("Informe o CPF do funcionario a ser removido: ");
					String cpfRemover = lerDados.next();

					gerenciarFuncionarios.removerFuncionario(cpfRemover);
					System.out.println("Funcionario removido !!");
					break;

				case 3:
					System.out.println("\n Lista de Funcionarios: ");
					gerenciarFuncionarios.listarFuncionarios();
					break;

				case 4:
					System.out.println("\n Edicao de Informacoes: ");
					String novoNome, novoCpf, novaDescricaoAtividade;
					int novaIdade;
					double novaCargaHoraria;
					
					System.out.println("Editar nome (s/n): ");
					validar = lerDados.next().charAt(0);
					if ((validar == 's') || (validar == 'S')) {
						lerDados.nextLine(); // Limpar o buffer
						System.out.print("Nome: ");
						novoNome = lerDados.nextLine();
					} else {
						novoNome = funcionario.getNome();
					}

					System.out.println("Editar idade (s/n): ");
					validar = lerDados.next().charAt(0);
					if ((validar == 's') || (validar == 'S')) {
						System.out.print("Idade: ");
						novaIdade = lerDados.nextInt();
					} else {
						novaIdade = funcionario.getIdade();
					}

					System.out.println("Editar Carga Horaria (s/n): ");
					validar = lerDados.next().charAt(0);
					if ((validar == 's') || (validar == 'S')) {
						System.out.print("Carga Horaria: ");
						novaCargaHoraria = lerDados.nextDouble();
						lerDados.nextLine(); // Limpar o buffer
					} else {
						novaCargaHoraria = funcionario.getCargaHoraria();
					}

					System.out.println("Editar Descrição da Atividade (s/n): ");
					validar = lerDados.next().charAt(0);
					if ((validar == 's') || (validar == 'S')) {
						System.out.print("Descrição da Atividade: ");
						novaDescricaoAtividade = lerDados.nextLine();
					} else {
						novaDescricaoAtividade = funcionario.getDescricaoAtividade();
					}
					
					novoCpf = funcionario.getCpf();
					Funcionario funcionarioEditado = new Funcionario(novoNome, novaIdade, novoCpf, novaCargaHoraria,novaDescricaoAtividade);
					gerenciarFuncionarios.editarInformacoes(novoCpf, funcionarioEditado);
					break;

				case 5:
					System.out.println("\nEncerrando o programa...");
					break;

				default:
					System.out.println("Opcao invalida. Escolha uma opcao valida.");
					break;
				}

				System.out.println();
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida. Certifique-se de inserir os tipos de dados corretos.");
		} catch (NullPointerException e) {
			System.out.println("A lista de funcionarios nao foi inicializada corretamente.");
		} finally {
			lerDados.close();
		}
	}
}
