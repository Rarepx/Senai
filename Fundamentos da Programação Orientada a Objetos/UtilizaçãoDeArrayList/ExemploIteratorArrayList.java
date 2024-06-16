package exemplosArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploIteratorArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(1);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);

		System.out.println("Conteúdo da lista: \n" + listaDeNumeros);

		Iterator<Integer> iterador = listaDeNumeros.iterator();

		System.out.println("\nValores do iterador" + ": ");
		while (iterador.hasNext()) {
			int numero = iterador.next();
			
			if(numero == 1) {
				iterador.remove();
			}
		}
		System.out.print(listaDeNumeros);
	}

}
