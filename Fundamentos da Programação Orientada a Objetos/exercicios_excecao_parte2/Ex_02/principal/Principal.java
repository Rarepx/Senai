package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Aluno;

public class Principal {
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);

		try {
			System.out.print("Quantidade de alunos a cadastrar: ");
			int quantidadeAlunos = lerDados.nextInt();

			Aluno[] alunos = new Aluno[quantidadeAlunos];

			for (int i = 0; i < quantidadeAlunos; i++) {
				lerDados.nextLine(); // Limpar o buffer

				System.out.println("\nCadastro do Aluno " + (i + 1));
				System.out.print("Nome: ");
				String nome = lerDados.nextLine();

				System.out.print("Idade: ");
				int idade = lerDados.nextInt();

				System.out.print("Nota: ");
				double nota = lerDados.nextDouble();

				alunos[i] = new Aluno(nome, idade, nota);
			}

			System.out.println("-- Informações dos Alunos --");
			for (int i = 0; i < quantidadeAlunos; i++) {
				System.out.println("\nAluno " + (i + 1));
				alunos[i].exibirInformacoes();
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Insera os tipos de dados corretos.");
		} catch (NegativeArraySizeException e) {
			System.out.println("A quantidade de alunos não pode ser negativa.");
		} finally {
			lerDados.close();
		}
	}
}
