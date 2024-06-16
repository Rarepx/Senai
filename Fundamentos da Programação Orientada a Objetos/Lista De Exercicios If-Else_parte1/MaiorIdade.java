package exercicios;

import java.util.Scanner;
public class MaiorIdade {

	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade = entrada.nextInt();
					
		if (idade >= 18) {
			System.out.print("Maior de idade");
		}else {
			System.out.print("Menor de idade");
		}
		entrada.close();
	}

}
