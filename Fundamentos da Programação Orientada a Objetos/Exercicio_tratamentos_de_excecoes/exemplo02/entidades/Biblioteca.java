package entidades;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        if(!verificaSeLivroCadastrado(livro.getNumeroIdentificacao())) {
        	livros.add(livro);
        	System.out.println("Livro cadastrado com sucesso !");
        }else {
        	System.out.println("Livro ja cadastrado !");
        }
    }
    
//    public void adicionarLivro(Livro livro) {
//        if (livros.contains(livro)) {
//            throw new IllegalArgumentException("O livro ja esta cadastrado na biblioteca.");
//        }
//        livros.add(livro);
//    }
    
    
    /**
     *  O método inicialmente verifica se a lista está vazia
     *  - Percorre toda a lista para investigar se existe algum id igual
     *  
     * Recebe o id do livro o qual deseja verificar se já foi cadastrado
     * @param id
     * 
     * @return true se já foi cadastrado e false caso contrário
     */
    private boolean verificaSeLivroCadastrado(int id) {
    	if(!livros.isEmpty()) {
    		for(Livro livro : livros) {
        		if(livro.getNumeroIdentificacao() == id) {
        			return true;
        		}
        	}
        	return false;
    	}
    	return false;
    }

    public void removerLivro(Livro livro) {
    	if(!livros.isEmpty()) {
    		livros.remove(livro);
    	}else {
    		System.out.println("Não é possível remover - A lista está Vazia!");
    	}
        
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca nao possui livros cadastrados.");
        } else {
            for (Livro livro : livros) {
                livro.exibirInformacoes();
            }
        }
    }
}
