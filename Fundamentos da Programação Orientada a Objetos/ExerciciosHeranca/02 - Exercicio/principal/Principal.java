package principal;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Pessoa;

public class Principal {
	public static void main(String[] args) {
		int opcao, idade;
		String nome, curso;
		Scanner lerDados = new Scanner(System.in);

		System.out.println(" 1 - para instanciar uma Pessoa ");
		System.out.println(" 2 - para instanciar um Aluno ");
		System.out.println("Escolha uma das opções: ");
		opcao = lerDados.nextInt();
		lerDados.nextLine();

		if (opcao == 1) {
			System.out.print("Digite o nome da pessoa: ");
			nome = lerDados.nextLine();
			System.out.print("Digite a idade da pessoa: ");
			idade = lerDados.nextInt();

			Pessoa pessoa = new Pessoa(nome, idade);
			pessoa.exibirInformacao();
		} 
		else if (opcao == 2) {
			System.out.print("Digite o nome do aluno: ");
			nome = lerDados.nextLine();
			System.out.print("Digite a idade do aluno: ");
			idade = lerDados.nextInt();
			lerDados.nextLine(); 
			System.out.print("Digite o nome do curso que o aluno está cursando: ");
			curso = lerDados.nextLine();

			Aluno aluno = new Aluno(nome, idade, curso);
			aluno.exibirInformacao();
		} 
		else {
			System.out.println("Opção inválida!");
		}
		lerDados.close();
	}
}
