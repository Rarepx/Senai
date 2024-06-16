package exercicios;

import java.util.Scanner;

public class VerificaSePosNegOuZero {
	public static void main(String[] args) {
		int valor;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		valor = entrada.nextInt();
	
		if (valor > 0) {
			System.out.println("O número é positivo !");
		} 
		else if (valor < 0) {
			System.out.println("O número é negativo !");
		} 
		else {
			System.out.println("O número é zero !");
		}
		entrada.close();
	}

}
