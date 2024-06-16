package exemplosArrayList;

import java.util.ArrayList;

public class ExemploArrayListString {

	public static void main(String[] args) {
	    ArrayList<String> nomes = new ArrayList<String>();

	    System.out.println("Tamanho inicial: " + nomes.size() );

	    nomes.add("Aluno_1");
	    nomes.add("Aluno_2");
	    nomes.add("Aluno_3");
	    System.out.println("novo tamanho: " + nomes.size() );
	       
	    for ( int i=0; i<nomes.size(); i++ ) {
	      System.out.println("elemento " + i + ": " + nomes.get(i) );
	  }
	}

}
