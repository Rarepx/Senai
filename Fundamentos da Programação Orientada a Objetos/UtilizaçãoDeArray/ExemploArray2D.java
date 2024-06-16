package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploArray2D {
        //remova ou adicione comentários para visualizar diferenças
	public static void main(String[] args) {
		int [][]array2D;
		int linha = 2, coluna = 2;
		
		array2D = new int[linha][coluna];
		
		Scanner lerDados = new Scanner(System.in);
		// exemplo 1 adicionar elementos
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++){
				System.out.printf("Informe um elemento de posição [%d][%d]:",i,j);
				array2D[i][j] = lerDados.nextInt();
			}
		}
		// exemplo 2 adicionar elementos  
//		for(int i = 0; i < array2D.length; i++) {
//			for(int j = 0; j < array2D[i].length; j++){
//				System.out.println("Informe um elemento: ");
//				array2D[i][j] = lerDados.nextInt();
//			}
//		}
		
		// exemplo 1 exibir elementos
//		for(int[]i : array2D) {
//			for(int j : i)
//			System.out.println(j);
//		}
		
		// exemplo 2 exibir elementos
//		System.out.println("\nVisualizar Conteúdo do Array2D");
//		for(int i = 0; i < array2D.length; i++) {
//			for(int j = 0; j < array2D.length; j++){
//				System.out.println(array2D[i][j]);
//			}
//		}
		
		// exemplo 3 exibir elementos
		System.out.println("\nVisualizar Conteúdo do Array2D");
		for(int i = 0; i < array2D.length; i++) {
			System.out.println(Arrays.toString(array2D[i]));
		}
		
		lerDados.close();
	}

}
