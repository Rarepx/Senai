package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArray {

	public static void main(String[] args) {
		int auxiliar = 0;
		int[] array;
		Scanner lerTeclado = new Scanner(System.in);
		
		array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("Informe a posição[%d]: ",i);
			array[i] = lerTeclado.nextInt(); 
		}
		
		//organizar array
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				///compara vetores e organiza usando uma variável auxíliar
				if (array[i] > array[j]) {
					auxiliar = array[i];
					array[i] = array[j];
					array[j] = auxiliar;
				}
			}
		}
		System.out.println("\n Arrays Ordenados: ");
		System.out.println(Arrays.toString(array));

	}

}
