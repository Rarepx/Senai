package casosComIF_ELSE;

import java.util.Scanner;

public class CalcMedia3Notas {
	public static void main(String[] args) {
		double n1, n2, n3, media;
		Scanner lerTeclado = new Scanner(System.in);

		// lê os três números
		System.out.println("Digite três números:");
		n1 = lerTeclado.nextDouble();
		n2 = lerTeclado.nextDouble();
		n3 = lerTeclado.nextDouble();

		// calcula a média
		media = (n1 + n2 + n3)/3;

		// informa se foi aprovado ou reprovado
		if (media >= 5) {
			System.out.printf("Média = %.2f \nAprovado", media);
		} else {
			System.out.printf("Média = %.2f \nReprovado", media);
		}
		
		lerTeclado.close();
	}
}