package arrays;

public class ExemploArrayComMetodo {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		  
		  exibirConteudoDoArray(array);
	}
	
	public static void exibirConteudoDoArray(int[] array) {
		
		System.out.println("Valores dentro da linha do array");
		for(int i = 0; i < array.length; i++) {
				System.out.printf("%d ",array[i]);
		}
	}


}
