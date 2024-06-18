package main;

import java.util.Scanner;

import controller.AlunoController;
import controller.AlunoTelefoneController;
import model.Aluno;
import model.AlunoTelefone;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AlunoController alunoController = new AlunoController();
		AlunoTelefoneController alunoTelefoneController = new AlunoTelefoneController();

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Adicionar Aluno");
			System.out.println("2 - Adicionar Telefone");
			System.out.println("3 - Listar Alunos");
			System.out.println("4 - Exibir Aluno");
			System.out.println("5 - Atualizar Aluno");
			System.out.println("6 - Excluir Aluno");
			System.out.println("0 - Sair");
			System.out.print("Digite a opção desejada: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do aluno: ");
				String nome = scanner.nextLine();

				System.out.print("Digite a idade do aluno: ");
				int idade = scanner.nextInt();
				
				alunoController.adicionaAluno(nome, idade);
				break;
				
			case 2:
				alunoController.listaAlunos();

				System.out.print("Digite ID do aluno que deseja adicionar o telefone: ");
				int id_aluno = scanner.nextInt();
				scanner.nextLine();
				
				Aluno aluno = alunoController.buscaAlunoPorId(id_aluno);

				System.out.print("Digite o telefone do Aluno: ");
				String telefone = scanner.nextLine();

				alunoTelefoneController.adicionaTelefone(aluno, telefone);
				break;
				
			case 3:
				alunoController.listaAlunos();
				break;
				
			case 4:
				alunoController.listaAlunos();

				System.out.print("Digite o ID do aluno que deseja exibir: ");
				Integer id_aluno_exibe = scanner.nextInt();
				scanner.nextLine();

				alunoController.exibeAluno(id_aluno_exibe);
				alunoTelefoneController.exibeAlunoTelefone(id_aluno_exibe);
				break;
				
			case 5:
				alunoController.listaAlunos();

				System.out.print("Digite o ID do aluno que deseja exibir: ");
				Integer id_aluno_atualiza = scanner.nextInt();scanner.nextLine();
				
				System.out.print("Digite o nome do aluno: ");
				String nome_atualiza = scanner.nextLine();

				System.out.print("Digite a idade do aluno: ");
				int idade_atualiza = scanner.nextInt();
				
				alunoController.atualizaAluno(id_aluno_atualiza, nome_atualiza, idade_atualiza);
				break;
				
			case 6:
				alunoController.listaAlunos();

				System.out.print("Digite o ID do aluno que deseja excluir: ");
				Integer id_aluno_exclui = scanner.nextInt();

				alunoController.excluiAluno(id_aluno_exclui);
				break;
			case 0:
				System.out.println("Saindo...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}

}
