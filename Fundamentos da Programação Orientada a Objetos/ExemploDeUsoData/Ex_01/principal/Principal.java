package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Turma;

public class Principal {

	public static void itensMenu() {
		System.out.println("== Menu ==");
		System.out.println("1 Adicionar aluno");
		System.out.println("2 Listar alunos");
		System.out.println("3 Remover aluno");
		System.out.println("4 Salvar alunos em arquivo");
		System.out.println("5 Sair");
		System.out.println("\nEntre com uma das opcoes: ");
	}

	public static void menuOpcoes() {
		int opcao;
		
		Aluno aluno = null;
		Turma turma = new Turma();
		Scanner lerDados = new Scanner(System.in);
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

		do {
			itensMenu();
			opcao = lerDados.nextInt();
			lerDados.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do aluno:");
				String nome = lerDados.nextLine();

				System.out.println("Digite a matrícula do aluno:");
				int matricula = lerDados.nextInt();
				lerDados.nextLine(); 

				System.out.println("Digite a idade do aluno:");
				int idade = lerDados.nextInt();
				lerDados.nextLine();

				System.out.println("Digite a data de início do curso (formato: dd/MM/yyyy):");
				String dataInicioCursoStr = lerDados.nextLine();
				Calendar dataInicioCurso = Calendar.getInstance();

				try {
					dataInicioCurso.setTime(dateFormat.parse(dataInicioCursoStr));
				} catch (ParseException e) {
					System.err.println("Excecao capturada: "+e.getMessage());
				}

				aluno = new Aluno(nome, matricula, idade, dataInicioCurso);
				turma.adicionarAluno(aluno);
				System.out.println("Aluno adicionado com sucesso!");
				break;

			case 2:
				System.out.println("Lista de Alunos:");
				turma.listarAlunos();
				break;

			case 3:
				turma.removerAluno(aluno);
				System.out.println("Aluno removido com sucesso!");
				break;

			case 4:
				System.out.println("Digite o nome do arquivo para salvar os dados dos alunos:");
				String nomeArquivo = lerDados.nextLine();

				turma.salvarEmArquivo(nomeArquivo + ".csv");
				System.out.println("Dados dos alunos salvos em arquivo com sucesso!");
				break;

			case 5:
				System.out.println("Encerrando o programa...");
				System.exit(0);
				break;

			default:
				System.out.println("Opcao invalida. Por favor, selecione uma opcao valida.");
			}
		} while (opcao != 5);
		lerDados.close();
	}

	public static void main(String[] args) {
		menuOpcoes();
	}
}
