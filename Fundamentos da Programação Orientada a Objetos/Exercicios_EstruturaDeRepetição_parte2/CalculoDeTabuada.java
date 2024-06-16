package lacoWhile;

import java.util.Scanner;

public class CalculoDeTabuada {

	public static void main(String[] args) {
	    int num = 0, resultado;
	    Scanner lerTeclado = new Scanner(System.in);

	    System.out.print("Digite um número entre 1 e 10: ");
	    num = lerTeclado.nextInt();

	    if (num >= 1 && num <= 10) {
	      System.out.println("Tabuada do " + num + ":");

	      for (int i = 1; i <= 10; i++) {
	        resultado = num * i;
	        System.out.println(num + " x " + i + " = " + resultado);
	      }
	    } 
	    else {
	      System.out.println("Número inválido.");
	    }

	    lerTeclado.close();
	}

}
