package exercicios;

import java.util.Scanner;

public class ClassificaTipoTriang {
	public static void main(String[] args) {
		float lado1, lado2, lado3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Classifica  triângulo: ");
		System.out.println("Informe o lado 1: ");
		lado1 = entrada.nextFloat();
		System.out.println("Informe o lado 2: ");
		lado2 = entrada.nextFloat();
		System.out.println("Informe o lado 3: ");
		lado3 = entrada.nextFloat();
		
		if ((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
			System.out.print("O triangulo é equilátero!!!");
		}
		else if((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
			System.out.print("O triangulo é isoceles!!!");
		}
		else {
			System.out.print("O triangulo é escaleno!!!");
		}
		entrada.close();
	}

}
