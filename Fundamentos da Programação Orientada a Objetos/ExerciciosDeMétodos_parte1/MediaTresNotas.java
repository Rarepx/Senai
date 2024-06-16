package metodos;

import java.util.Scanner;

public class MediaTresNotas {
	public static double calculoDaMedia(double nota1, double nota2, double nota3) {
	   return((nota1 + nota2 + nota3) / 3);
	}
	
	public static void main(String[] args) {
	    double nota1, nota2, nota3, media;  
	    Scanner lerTeclado = new Scanner(System.in);

	    System.out.print("Digite a primeira nota: ");
	    nota1 = lerTeclado.nextDouble();

	    System.out.print("Digite a segunda nota: ");
	    nota2 = lerTeclado.nextDouble();

	    System.out.print("Digite a terceira nota: ");
	    nota3 = lerTeclado.nextDouble();

	    media = calculoDaMedia(nota1, nota2, nota3);
	    System.out.println("A média das notas é: " + media);
	     
	    lerTeclado.close();
	}

}
