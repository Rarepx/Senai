package exemplosArrayList;

import java.util.ArrayList;

public class VerficarSeContemElemF2 {

	public static void main(String[] args) {
		 ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		 
		 listaDeNumeros.add(2);
		 listaDeNumeros.add(5);
		 listaDeNumeros.add(1);
		 listaDeNumeros.add(6);
	    
	     if (listaDeNumeros.indexOf(5) >= 0) {
	    	 System.out.println("5 esta contido no ArrayList");
	     }else {
	    	 System.out.println("5 nao esta contido no ArrayList");
	     }
	            
	     if (listaDeNumeros.indexOf(8) >= 0) {
	    	 System.out.println("8 esta contido no ArrayList");
	     } else {
	    	 System.out.println("8 nao esta contido no ArrayList");
	     }
	}

}
