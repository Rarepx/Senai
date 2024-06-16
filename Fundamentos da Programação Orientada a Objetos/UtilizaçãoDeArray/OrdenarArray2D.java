package arrays;

import java.util.Scanner;

public class OrdenarArray2D {

	public static void main(String[] args) {
		
		int[][] array2D;
		int linha, coluna;

		Scanner lerDados = new Scanner(System.in);
		//informar valor para o eixo x e y (linha e coluna)
		System.out.printf("Informe o número de linhas da Matriz 2D:");
		linha = lerDados.nextInt();
		
		System.out.printf("Informe o número de colunas da Matriz 2D:");
		coluna = lerDados.nextInt();
		
		//instância do objeto array2D
		array2D = new int[linha][coluna];
		
		//chama método e atribui conteúdo ao array2D
		array2D = inserirDadosNoArray(lerDados, array2D);

		System.out.println("\nArray antes de ordenar : ");
		exibirArray(array2D);
		
		System.out.println("\nOrdenando Array... ");
		ordenarArray(array2D);
		
		System.out.println("Array Orndenado : ");
		exibirArray(array2D);
	}

	public static int[][] inserirDadosNoArray(Scanner lerDados, int array2D[][]) {
		int linha = array2D.length;
		int coluna = array2D[0].length;
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.printf("Informe um elemento de posição [%d][%d]:", i, j);
				array2D[i][j] = lerDados.nextInt();
			}
		}
		return array2D;
	}

	public static void exibirArray(int arr[][]) {
		int linha = arr.length;
		int coluna = arr[0].length;
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void ordenarArray(int array[][]) {
		int linha = array.length, coluna = array[0].length;
		int auxiliar, dimensaoMatriz, resultadoDivisao, resultadoRestoDivisao, resultadoDivisaoProx, resultadoRestoDivisaoProx;
		int colunaA, colunaB; 
		
		dimensaoMatriz = (linha * coluna)-1;
		
		for (int i = 0; i < dimensaoMatriz; i++) {
			for (int j = 0; j < (dimensaoMatriz - i); j++) {
				
				resultadoDivisao = j / coluna;
				System.out.println("resultadoDivisao: "+resultadoDivisao);
				resultadoRestoDivisao = j % coluna;
				System.out.println("resultadoRestoDivisao: "+resultadoRestoDivisao);
				
				resultadoDivisaoProx = (j + 1) / coluna;
				resultadoRestoDivisaoProx = (j + 1) % coluna;
				
				colunaA = array[resultadoDivisao][resultadoRestoDivisao];
				colunaB = array[(j + 1) / coluna][(j + 1) % coluna];
				
				if (colunaA > colunaB) {
					auxiliar = array[resultadoDivisaoProx][resultadoRestoDivisaoProx];
					array[resultadoDivisaoProx][resultadoRestoDivisaoProx] = array[resultadoDivisao][resultadoRestoDivisao];
					array[resultadoDivisao][resultadoRestoDivisao] = auxiliar;
				}
			}
		}
	}

}
