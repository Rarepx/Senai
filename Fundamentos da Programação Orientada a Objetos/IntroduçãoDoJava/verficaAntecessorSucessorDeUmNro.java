package entradaSaidaDeDados;

import java.util.Scanner;

public class verficaAntecessorSucessorDeUmNro {
	public static void main(String[] args) {
	  int antecessor, sucessor, numero;
	  	
	  Scanner lerDado = new Scanner(System.in);
	  System.out.println("Informe um número: ");
          numero = lerDado.nextInt(); 
          
          antecessor = numero -1;
          sucessor = numero +1;
          
      	  System.out.printf("Número Digitado: %d \n",numero);
      	  System.out.printf("Número Antecessor: %d \n",antecessor);
      	  System.out.printf("Número Sucessor: %d \n",sucessor);
      	
      	  lerDado.close();
	}
}
