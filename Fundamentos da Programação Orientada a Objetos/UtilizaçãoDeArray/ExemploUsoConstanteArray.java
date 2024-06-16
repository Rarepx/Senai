package arrays;

public class ExemploUsoConstanteArray {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10; //declaração de constante	
		int[] array = new int[ARRAY_LENGTH];
		array = new int[10]; //cria o objeto do array

		for(int i = 0; i < array.length; i++){
			array[i] = 2 + 2*i; 
		}
		System.out.printf("%s%8s\n","Indice","Valor");
		for(int i = 0; i < array.length; i++){
			System.out.printf("%s%9s\n",i,array[i]);
		}

	}

}
