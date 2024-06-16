package lacoWhile;

import java.util.Scanner;

public class PrimosEntre2Nros {
	
	 // Método para verificar se um número é primo
	  public static boolean ehPrimo(int numero) {
		int resto = 0;
		  
		  for (int j = 2; j < numero; j++) {
	                resto = numero % j;
			if (resto == 0) {
				return false;
			}
	      }
	    return true;
	  }

	public static void main(String[] args) {
	    int numeroInicial=0, numeroFinal=0;
	    int maiorNro = 0, menorNro=0;
		
	    Scanner lerTeclado = new Scanner(System.in);
	    

	    System.out.print("Digite o número inicial: ");
	    numeroInicial = lerTeclado.nextInt();
	    System.out.print("Digite o número final: ");
	    numeroFinal = lerTeclado.nextInt();
	    
	    if(numeroInicial > numeroFinal) {
	    	maiorNro = numeroInicial;
	    	menorNro = numeroFinal;
	    }else {
	    	maiorNro = numeroFinal;
	    	menorNro = numeroInicial;
	    }
	    
	    System.out.println("Números primos entre " + menorNro + " e " + maiorNro + ":");

	    for (int i = menorNro; i <= maiorNro; i++) {
	      if (ehPrimo(i)) {
	        System.out.println(i);
	      }
	    }
	    
	    lerTeclado.close();
	  }

	 

}
