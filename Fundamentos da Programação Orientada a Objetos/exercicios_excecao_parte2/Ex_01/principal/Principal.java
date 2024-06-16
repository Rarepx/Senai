package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import excecoes.NumeroNegativoException;

public class Principal {
	public static void main(String[] args) {
		boolean permanecerNoLaco = true;
		int valor = 0, contador = 0, tamanhoVetor = 0;
		int[] vetor = new int[5];

		Scanner lerDados = new Scanner(System.in);
		System.out.println("Informe o tamanho do vetor: ");
		tamanhoVetor = lerDados.nextInt();

		int i = 0;
		do {
			try {
				for (i = contador; i < tamanhoVetor; i++) {
					System.out.print("Informe o valor para a posição " + i + ": ");
					valor = lerDados.nextInt();
					contador = i;
					if (valor < 0) {
						throw new NumeroNegativoException("Não são permitidos números negativos.");
					}
					vetor[i] = valor;
				}
				permanecerNoLaco = false;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("\nPosição inexistente. O vetor possui apenas 5 posições. \n" + e.getMessage());
				break;
			} catch (InputMismatchException e) {
				System.err.println("Valor informado não é um número válido. " + e.getMessage());
				lerDados.nextLine();
			} catch (NumeroNegativoException e) {
				System.err.println(e.getMessage());
				System.out.println("Entre com outro valor: ");
			}
		} while (permanecerNoLaco);

		lerDados.close();
		System.out.println("Valores do vetor:");
		for (int j = 0; j < 5; j++) {
			System.out.println("Posição " + j + ": " + vetor[j]);
		}
	}
}
