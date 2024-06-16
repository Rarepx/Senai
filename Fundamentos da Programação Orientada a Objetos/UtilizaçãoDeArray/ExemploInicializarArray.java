package arrays;

public class ExemploInicializarArray {

	public static void main(String[] args) {
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		System.out.printf("%s%7s\n","Indice","Valor");
	    
		for(int i = 0; i < array.length; i++){
			System.out.printf("%s%9s\n",i,array[i]);
		}


	}

}
