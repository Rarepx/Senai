package entidades;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> acervo;

    public Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    public void cadastrarLivro(Livro livro) {
        acervo.add(livro);
    }

    public boolean verificarDisponibilidadeLivro(String titulo) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equals(titulo) && (livro.getQtdExemplares() > 0)) {
            	return true;
            }
        }
        return false;
    }

    public void emprestarLivro(String titulo, int numeroDeLivrosDevolvidos) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equals(titulo)) {
                if (livro.getQtdExemplares() > 0) {
                	livro.decrementarExemplares(numeroDeLivrosDevolvidos);
                    System.out.println("\nLivro " + livro.getTitulo() + " emprestado com sucesso!");
                    break;
                } else {
                    System.out.println("Não há exemplares disponíveis do livro " + livro.getTitulo());
                    break;
                }
            }
        }
    }

    public void devolverLivro(String titulo, int numeroDeLivrosDevolvidos) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equals(titulo)) {
            	livro.incrementarExemplares(numeroDeLivrosDevolvidos);
                System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso!");
                break;
            }
        }
    }

    public ArrayList<Livro> buscarLivrosPorTipo(TipoLivro tipo) {
        ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();
        for (Livro livro : acervo) {
            if (livro.getTipo().equals(tipo)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public void exibirAcervo() {
        if (acervo.size() == 0) {
            System.out.println("Acervo da biblioteca está vazio.");
            return;
        }
        System.out.println("Acervo da biblioteca:");
        for (Livro livro : acervo) {
            System.out.println(livro.toString());
        }
    }
}
