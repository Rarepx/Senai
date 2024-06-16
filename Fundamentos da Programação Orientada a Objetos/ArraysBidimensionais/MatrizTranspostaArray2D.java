package exemploArrays2D;

import java.util.Scanner;

public class MatrizTranspostaArray2D {
	
	public static void matrizOrginal(int[][] matriz, int ordemMatriz) {
		System.out.println("Matriz Original: ");
		for (int i = 0; i < ordemMatriz; i++) {
			for (int j = 0; j < ordemMatriz; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void matrizTransposta(int[][] matriz, int ordemMatriz) {
		System.out.println("Matriz Transposta: ");
		for (int i = 0; i < ordemMatriz; i++) {
			for (int j = 0; j < ordemMatriz; j++) {
				System.out.print(matriz[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		int[][] matriz2D;
		int ordemMatriz; 
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Informe a ordem da matriz 2D: ");
		ordemMatriz = lerDados.nextInt();
		 
		matriz2D = new int [ordemMatriz][ordemMatriz];
		for(int i = 0; i < matriz2D.length; i++) {
			for(int j = 0; j < matriz2D.length; j++) {
				System.out.printf("Informe a posição[%d][%d]: ",i,j);
				matriz2D[i][j] = lerDados.nextInt();
			}
		}
		
		matrizOrginal(matriz2D, ordemMatriz);
		matrizTransposta(matriz2D, ordemMatriz);
		
		lerDados.close();
	}
}
