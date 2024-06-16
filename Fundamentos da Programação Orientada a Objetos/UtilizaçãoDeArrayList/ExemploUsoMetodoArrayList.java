package exemplosArrayList;

import java.util.ArrayList;

public class ExemploUsoMetodoArrayList {

	public static void exibirArrayList(ArrayList<String> linguagensDeProg) {
		
		System.out.print("Linguagens de Programação: ");
		    
		for(String s : linguagensDeProg) {
			System.out.print(s + ", ");
		}
			
	}
		
	public static void main(String[] args) {
		ArrayList<String> linguagensDeProgramacao = new ArrayList<>();
		
		linguagensDeProgramacao.add("Java");
		linguagensDeProgramacao.add("Python");
		linguagensDeProgramacao.add("C++");
		linguagensDeProgramacao.add("C#");

		// passando arraylist como parâmetro de método
		exibirArrayList(linguagensDeProgramacao);
	}
		

}


