package principal;

import entidades.Editora;
import entidades.Autor;
import entidades.Livro;

public class Principal {
     public static void main(String[] args) {
	// Criação do autor
        Autor autor = new Autor("José de Alencar", 48, "Fortaleza, Brasil");
        
        // Criação da editora
        Editora editora = new Editora("Companhia das Letras", 1, "São Paulo");
        
        // Criação do livro
        Livro livro = new Livro("Iracema", 40, autor, editora);
        
        // Exibindo informações do livro
        System.out.println(livro);
    }
}
