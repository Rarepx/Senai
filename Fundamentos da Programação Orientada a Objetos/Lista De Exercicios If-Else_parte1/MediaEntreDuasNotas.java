package exercicios;

import java.util.Scanner;
public class MediaEntreDuasNotas {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = entrada.nextFloat();
		
		media = (nota1+nota2)/2;
		
		System.out.print("média é:");
		System.out.print(media);
		
		entrada.close();
	}

}
