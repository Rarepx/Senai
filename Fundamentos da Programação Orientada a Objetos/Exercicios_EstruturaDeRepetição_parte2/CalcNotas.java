package lacoWhile;

import java.util.Scanner;

public class CalcNotas {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner lerTeclado = new Scanner(System.in);

		do{
			System.out.print("Digite a primeira nota (entre 0 e 10): ");
			nota1 = lerTeclado.nextDouble();
			if((nota1 < 0) || (nota1 > 10)) {
				System.out.println("Valor inválido. Digite novamente.");
			}
		}while((nota1 < 0) || (nota1 > 10));

		do{
			System.out.print("Digite a segunda nota (entre 0 e 10): ");
			nota2 = lerTeclado.nextDouble();
			if((nota2 < 0) || (nota2 > 10)) {
				System.out.println("Valor inválido. Digite novamente.");
			}
		}while((nota2 < 0) || (nota2 > 10));

		do {
			System.out.print("Digite a terceira nota (entre 0 e 10): ");
			nota3 = lerTeclado.nextDouble();
			if((nota3 < 0) || (nota3 > 10)) {
				System.out.println("Valor inválido. Digite novamente.");
			}
		} while((nota3 < 0) || (nota3 > 10));

		media = ((nota1 + nota2 + nota3) / 3);
		System.out.println("A média das notas é: " + media);

		lerTeclado.close();

	}

}
