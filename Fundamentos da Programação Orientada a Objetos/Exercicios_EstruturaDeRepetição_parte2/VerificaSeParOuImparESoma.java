package lacoWhile;

import java.util.Scanner;

public class VerificaSeParOuImparESoma {

	public static void main(String[] args) {
		int num = 0, soma = 0, resto = 0;
	    
		Scanner lerTeclado = new Scanner(System.in);
		    
		do{
			System.out.print("Digite um número entre 1 e 10 (-1 para sair): ");
		    num = lerTeclado.nextInt();
		      
		    if((num >= 1) && (num <= 10)){
		    	resto = num % 2;
		    	if (resto == 0) {
		        System.out.println(num + " é par");
		     }else{
		          System.out.println(num + " é ímpar");
		        }
		        soma = soma + num;
		      } else if (num != -1) {
		        System.out.println("Número inválido!");
		      }
		      
		 }while (num != -1);
		  
		 System.out.println("A soma dos números digitados é: " + soma);  
		 lerTeclado.close();
	}

}
