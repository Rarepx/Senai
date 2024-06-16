package lacoWhile;

import java.util.Scanner;

public class NroMaiorMenorMediaEntre4Nros {

	public static void main(String[] args) {
	    int contador = 0, num = 0, soma = 0;
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    double media;
	  
	    Scanner lerTeclado = new Scanner(System.in);
	    
	    do {
	      System.out.print("Digite um número: ");
	      num = lerTeclado.nextInt();

	      contador++;
	      soma += num;

	      if (num > max) {
	        max = num;
	      }

	      if (num < min) {
	        min = num;
	      }
	    } while (contador < 4);

	    media = ((double) (soma / contador));

	    System.out.println("O maior número digitado é: " + max);
	    System.out.println("O menor número digitado é: " + min);
	    System.out.println("A média dos números digitados é: " + media);

	    lerTeclado.close();
	}

}
