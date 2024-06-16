package lacoWhile;

import java.util.Scanner;

public class VerificaMaiorIdade5Pessoas {

	public static void main(String[] args) {
		int idade, contadorMaior = 0, contadorMenor = 0;
		Scanner lerDados = new Scanner(System.in);
	    

	    for (int i = 1; i <= 5; i++) {
	      System.out.print("Digite a idade da pessoa " + i + ": ");
	      idade = lerDados.nextInt();

	      if (idade > 18) {
	        contadorMaior++;
	      }else {
	    	contadorMenor++;  
	      }
	    }
	    
	    System.out.println("\n-- Entre as 5 idades digitadas temos --");
	    System.out.println("Existem " + contadorMaior + " pessoas com mais de 18 anos.");
	    System.out.println("Existem " + contadorMenor + " pessoas com menos de 18 anos.");
	    lerDados.close();
	}

}
