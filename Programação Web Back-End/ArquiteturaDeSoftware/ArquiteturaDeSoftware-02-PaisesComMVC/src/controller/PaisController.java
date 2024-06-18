package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import exception.MenosDeQuatroItensException;
import model.Pais;
import view.PaisView;

public class PaisController {
	// Cria uma coleção em forma de List, para armazenar objetos do tipo Pais
	private List<Pais> listaDePaises;

	// Cria um objeto paisView, para poder exibir informações ao usuário
	private PaisView paisView;

	// Ao criar um PaisController, o método construtor tbm instancia a lista de
	// países e a classe paisView
	public PaisController() {
		listaDePaises = new ArrayList<>();
		paisView = new PaisView();
	}

	// Método adicionar país
	public void adicionarPais(String nome, String capital) {
		// Cria um objeto do tipo Pais
		Pais pais = new Pais(nome, capital);

		// Adiciona um objeto Pais na listaDePaises usando o método add
		listaDePaises.add(pais);
	}

	// Método exibir lista de países
	public void exibirListaDePaises() {
		// Utiliza paisView para invocar o método exibirListaDePaises
		paisView.exibirListaDePaises(listaDePaises);
	}

	// Método remover país
	public void removerPais(String nomePaisRemover) {
		// Variável do tipo boolean (true/false) que terá a informação se o país foi ou
		// não removido, iniciada com false
		boolean paisRemovido = false;

		// Estrutura de repetição "for" preparada para trabalhar com coleções, também
		// conhecida como "foreach"
		for (Pais pais : listaDePaises) {

			// Estrutura condicional que verifica se o nome do país da lista é igual ao nome
			// do país recebido por parametro
			// Método equalsIgnoreCase -> ignora letras maiúsculas e minúsculas
			if (pais.getNome().equalsIgnoreCase(nomePaisRemover)) {
				// Método que remove o país da lista
				listaDePaises.remove(pais);

				// Atribui true para variável de controle que guarda a informação true/false
				// sobre a remoção do país d alista
				paisRemovido = true;

				// Ao remover o país da lista, não temos a necessidade de continuar percorrendo
				// a lista, por isso, o comando break termina os loops do for
				break;
			}
		}

		// Invoca o método removerPais do paisView e passa a informação (paisRemovido)
		// se o país foi removido
		paisView.removerPais(paisRemovido);
	}

	// Método utilizado para limpar a lista de países
	public void limparListaDePaises() {
		// Método .clear limpa uma lista
		listaDePaises.clear();

		// Invoca o método limparListaDePaises do paisView
		paisView.limparListaDePaises();
	}

	// Método primeiro - retorna o primeiro pais da lista
	public void primeiro() {
		// try - estrutura que permite lidar com exceções (erros)
		try {
			// Verifica se a lista esta vazia
			if (listaDePaises.isEmpty()) {
				// Invoca a exceção passando uma mensagem como parametro
				throw new NoSuchElementException("A lista está vazia. Não é possível pegar o primeiro elemento.");
			}

			// Cria um objeto pais e recebe o primeiro pais da lista
			Pais pais = listaDePaises.get(0);

			// Invoca o método exibirPais do objeto paisView
			paisView.exibirPais(pais);
		}

		// Código para lidar com a exceção (erro)
		catch (NoSuchElementException e) {
			// É invocada pelo "throw new"
			System.out.println(e.getMessage());
		}
	}

	// Método terceiro - retorna o terceiro pais da lista
	public void terceiro() {
		// try - estrutura que permite lidar com exceções (erros)
		try {
			// Verifica se a lista tem tamanho menor que 3
			if (listaDePaises.size() < 3) {
				// Invoca a exceção passando uma mensagem como parametro
				throw new NoSuchElementException("A lista não contém pelo menos 3 elementos.");
			}

			// Cria um objeto pais e recebe o terceiro pais da lista
			Pais pais = listaDePaises.get(2);

			// Invoca o método exibirPais do objeto paisView
			paisView.exibirPais(pais);
		}

		// Código para lidar com a exceção (erro)
		catch (NoSuchElementException e) {
			// É invocada pelo "throw new"
			System.out.println(e.getMessage());
		}
	}

	// Método quarto - retorna o quarto país da lista
	public void quarto() throws MenosDeQuatroItensException {
		// try - estrutura que permite lidar com exceções (erros)
		try {
			// Verifica se a lista tem tamanho menor que 4
			if (listaDePaises.size() < 4) {
				// Invoca a exceção passando uma mensagem como parametro
				throw new MenosDeQuatroItensException("A lista não contém pelo menos 4 elementos.");
			}

			// Cria um objeto pais e recebe o quarto país da lista
			Pais pais = listaDePaises.get(3);

			// Invoca o método exibirPais do objeto paisView
			paisView.exibirPais(pais);
		} catch (MenosDeQuatroItensException e) {
			// É invocada pelo "throw new"
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
