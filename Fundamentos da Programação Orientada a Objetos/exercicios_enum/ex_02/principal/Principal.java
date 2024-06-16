package principal;

import java.util.ArrayList;

import entidades.Biblioteca;
import entidades.Livro;
import entidades.TipoLivro;

public class Principal {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		// Cria uma lista de livros vazia
		ArrayList<Livro> livros = new ArrayList<>();

		// Cadastra alguns livros na lista
		Livro livro1 = new Livro("O Rapto do Garoto de Ouro", "Marcos Rey", "Editora - Vagalume", 1982, TipoLivro.AVENTURA, 10);
		Livro livro2 = new Livro("Iracema", "Jose de Alencar", "Editora - Brasil", 1865, TipoLivro.ROMANCE, 12);
		Livro livro3 = new Livro("O Guarani", "Jose de Alencar", "Editora - Brasil", 1857, TipoLivro.ROMANCE, 12);
		
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		
		biblioteca.cadastrarLivro(livro1);
		biblioteca.cadastrarLivro(livro2);
		biblioteca.cadastrarLivro(livro3);
		
		biblioteca.exibirAcervo();
		
		System.out.println("\nLivros de Romance: "+biblioteca.buscarLivrosPorTipo(TipoLivro.ROMANCE));
		
		
		System.out.println("\nVerificar Disponibilidade do livro: "+livro2.getTitulo());
		boolean disponivel = biblioteca.verificarDisponibilidadeLivro(livro2.getTitulo());
		if(disponivel) {
			System.out.println("Livro Disponível");
		}else {
			System.out.println("Livro Indisponível");
		}
		
		biblioteca.emprestarLivro(livro2.getTitulo(),1);
		biblioteca.exibirAcervo();
		
		System.out.println("Livro: "+livro2.getTitulo() + " devolvido");
		biblioteca.devolverLivro(livro2.getTitulo(),1);
		biblioteca.exibirAcervo();
		
	}
}
