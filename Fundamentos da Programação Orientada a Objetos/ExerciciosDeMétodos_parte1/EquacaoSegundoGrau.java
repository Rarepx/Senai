package metodos;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	public static void calcularEquacaoSegundoGrau(double a, double b, double c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1, x2;
        	
		if (delta < 0) {
            		System.out.println("A equação não possui raízes reais.");
        	}

        	x1 = (-b + Math.sqrt(delta)) / (2 * a);
        	x2 = (-b - Math.sqrt(delta)) / (2 * a);

        	System.out.printf("\nx1 = %.2f\n",x1);
        	System.out.printf("x2 = %.2f",x2);
    	}
	
	public static void main(String[] args) {
		double a, b, c;
		Scanner lerDados = new Scanner(System.in);

		System.out.print("Digite o valor de a: ");
		a = lerDados.nextDouble();

		System.out.print("Digite o valor de b: ");
		b = lerDados.nextDouble();

		System.out.print("Digite o valor de c: ");
		c = lerDados.nextDouble();

		calcularEquacaoSegundoGrau(a, b, c);
		lerDados.close();
    }
}
