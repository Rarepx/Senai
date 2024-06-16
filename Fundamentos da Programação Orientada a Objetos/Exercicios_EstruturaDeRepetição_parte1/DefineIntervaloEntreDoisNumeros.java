package lacoWhile;

import java.util.Scanner;

public class DefineIntervaloEntreDoisNumeros {

	public static void main(String[] args) {
		int numero1, numero2, numeroMaior, numeroMenor;
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
		
		for(int i = numeroMenor+1; i < numeroMaior; i++) {
			System.out.println(i);
		}
		
		lerDados.close();
	}

}
