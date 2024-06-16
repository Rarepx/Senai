package arrays;

public class ExemploArrayComMetodo {

	public static void main(String[] args) {
		int[][] array1 = {{1,2,3},{4,5,6}};
		int[][] array2 = {{1,2},{3},{4,5,6}};
		  
		  System.out.println("Valores dentro da linha do array1");
		  saidaDoArray(array1);
		  
		  System.out.println("\nValores dentro da linha do array2");
		  saidaDoArray(array2);
	}
	
	public static void saidaDoArray(int[][] array) {
		
		for(int linha = 0; linha < array.length; linha++) {
			for(int coluna = 0; coluna < array[linha].length; coluna++) {
				System.out.printf("%d ",array[linha][coluna]);
			}
			System.out.println();
		}
	}


}
