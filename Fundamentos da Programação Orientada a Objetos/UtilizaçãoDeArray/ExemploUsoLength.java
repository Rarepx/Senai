package arrays;

import java.util.Scanner;

public class ExemploUsoLength {

	public static void main(String[] args) {
		int[] array; //declara o array identificado
		array = new int[10]; //cria o objeto do array
		Scanner lerDados = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++){
			System.out.printf("Informe a posição[%d]: ",i);
			array[i] = lerDados.nextInt(); 
		}
		
		System.out.printf("%s%7s\n","Indice","Valor");
		for(int i = 0; i < array.length; i++){
			System.out.printf("%s%9s\n",i,array[i]);
		}
	}

}
