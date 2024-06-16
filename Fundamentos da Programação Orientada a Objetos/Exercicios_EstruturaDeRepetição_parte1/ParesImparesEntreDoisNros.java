package lacoWhile;

import java.util.Scanner;

public class ParesImparesEntreDoisNros {

	public static void main(String[] args) {
		int numero1, numero2, numeroMaior, numeroMenor, resto, contPar=0, contImpar=0;
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		numero1 = lerDados.nextInt();
		System.out.println("Informe o segundo número: ");
		numero2 = lerDados.nextInt();
		
		while (numero1 == numero2) {
			System.out.println("Os número devem ser diferentes !!! ");
			System.out.println("Informe o primeiro número: ");
			numero1 = lerDados.nextInt();
			System.out.println("Informe o segundo número: ");
			numero2 = lerDados.nextInt();	
		}
		
		if(numero1 > numero2) {
			numeroMaior = numero1;
			numeroMenor = numero2;
			System.out.printf("Número entre %d e %d \n",numeroMenor, numeroMaior);
		}else {
			numeroMaior = numero2;
			numeroMenor = numero1;
			System.out.printf("Número entre %d e %d \n",numeroMenor, numeroMaior);
		}
		
		for(int i = numeroMenor; i <= numeroMaior; i++) {
			resto = i%2;
			if(resto == 0) {
				contPar++; 
			}else {
				contImpar++; 
			}
		}
		
		System.out.printf("Quantidade de Pares entre %d e %d é: %d\n",numeroMenor,numeroMaior,contPar);
		System.out.printf("Quantidade de Impares entre %d e %d é: %d\n",numeroMenor,numeroMaior,contImpar);
		lerDados.close();
	}

}
