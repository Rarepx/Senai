package lacoWhile;

import java.util.Scanner;

public class SomaNum {
	public static void main(String[] args) {
	    	int numero=0, soma=0;
		Scanner lerDados = new Scanner(System.in);
		
		do {
		     soma = soma + numero;
		     System.out.println("Informe um número: ");
		     numero = lerDados.nextInt();
		}while(numero != -1);
		
		System.out.printf("Resultado: %d",soma);
		lerDados.close();
	}
}
