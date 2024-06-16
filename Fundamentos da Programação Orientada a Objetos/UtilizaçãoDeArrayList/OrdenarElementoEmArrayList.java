package exemplosArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarElementoEmArrayList {

	public static void main(String[] args) {
		 ArrayList<Integer> numeros = new ArrayList<Integer>();
		 	numeros.add(33);
		 	numeros.add(15);
		 	numeros.add(20);
		 	numeros.add(34);
		 	numeros.add(8);
		 	numeros.add(12);

		    Collections.sort(numeros);

		    for (int i : numeros) {
		      System.out.println(i);
		    } 
	}

}
