package exemplosArrayList;

import java.util.ArrayList;

public class VerficarSeContemElemF1 {

	public static void main(String[] args) {
		 ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		 
		 listaDeNumeros.add(1);
		 listaDeNumeros.add(2);
		 listaDeNumeros.add(3);
		 listaDeNumeros.add(4);
	    
	     if (listaDeNumeros.contains(5)) {
	    	 System.out.println("5 esta contido no ArrayList");
	     }else {
	    	 System.out.println("5 nao esta contido no ArrayList");
	     }
	            
	     if (listaDeNumeros.contains(2)) {
	    	 System.out.println("2 esta contido no ArrayList");
	     } else {
	    	 System.out.println("2 nao esta contido no ArrayList");
	     }
	}

}
