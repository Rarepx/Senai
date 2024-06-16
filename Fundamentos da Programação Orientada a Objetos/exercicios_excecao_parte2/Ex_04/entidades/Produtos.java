package entidades;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Produtos {
	private LinkedList<Produto> listaProdutos;

	public Produtos() {
		listaProdutos = new LinkedList<>();
	}

	public void adicionar(Produto produto) {
		try {
			listaProdutos.add(produto);
			System.out.println("Produto adicionado com sucesso.");
		} catch (NullPointerException e) {
			System.out.println("Erro ao adicionar produto: " + e.getMessage());
		}
	}

	public void remover(int codigo) {
		boolean removido = false;
		try {
			for (Produto produto : listaProdutos) {
				if (produto.getCodigo() == codigo) {
					listaProdutos.remove(produto);
					System.out.println("Produto removido com sucesso.");
					removido = true;
					break;
				}
			}if (removido == false) {
			System.out.println("Não foi possível remover o produto. "
						+ "\nProduto não encontrado na lista.");
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("Erro ao remover produto: " + e.getMessage());
		}
	}

	public void listarProdutos() {
		if (listaProdutos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
			for (Produto produto : listaProdutos) {
				produto.exibirInformacoes();
			}
		}
	}

}
