package exemplosArrayList;

import java.util.ArrayList;

public class ExemploArrayListAdicionarRemover {

	public static void main(String[] args) {
		// Declarando um ArrayList
		// veja não foi declarado o tamanho da lista
		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}

		System.out.println("Lista inicial " + numeros);
		//adicionar número
		numeros.add(10);

		System.out.println("Lista com o número 10 " + numeros);
		//remover número
		numeros.remove(5);

		System.out.println("Lista sem o número 5 " + numeros);
	}

}
