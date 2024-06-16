package principal;

import entidades.Livro;
import entidades.LivroDidatico;
import entidades.LivroDeFiccao;

public class Principal {
	public static void main(String[] args) {
		Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
		System.out.printf("Informações Livro: \n");
		livro.informarDetalhes();
	    System.out.println();
	    
	    System.out.printf("Informações Livro Didatico: \n");
	    LivroDidatico livroDidatico = new LivroDidatico("História do Brasil", "Pedro Paulo Funari", 1999, "História", 9,"Ensino Médio");
	    livroDidatico.informarDetalhes();
	    System.out.println();
	    
	    LivroDeFiccao livroDeFiccao = new LivroDeFiccao("1984", "George Orwell", 1949, "Distopia", "Ficção Científica");
	    System.out.printf("Informações Livro de Ficcao: \n");
	    livroDeFiccao.informarDetalhes();
	    livroDeFiccao.sinopseDoLivro();
	}
}
