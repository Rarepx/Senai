package arrays;

import java.util.Scanner;

public class ExemploUsoArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner lerDados = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe o número de posição[%d]: ",i);
			array[i] = lerDados.nextInt();
		}
		
		System.out.printf("\n%s%7s\n","Indice","Valor");
		for(int i = 0; i < 10; i++){
			System.out.printf("%s%9s\n",i,array[i]);
		}
		
		lerDados.close();
	}


}
