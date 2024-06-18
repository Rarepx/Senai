package controller;

import dao.PaisDAO;
import model.Pais;
import view.PaisView;

public class PaisController {
	private PaisDAO paisDAO;
	private PaisView paisView;

	public PaisController() {
		paisDAO = new PaisDAO();
		paisView = new PaisView();
	}

	public void adicionarPais(String nome, String capital) {
		Pais pais = new Pais(nome, capital);

		paisDAO.adicionarPais(pais);
	}
	
	public void atualizarPais(Integer id, String nome, String capital) {
		boolean paisAtualizado = paisDAO.atualizarPais(id, nome, capital);
		
		paisView.atualizarPais(paisAtualizado);
	}
	
	public void buscaPaisPorNome(String nome) {
		paisView.exibirPais(paisDAO.buscarPaisPorNome(nome));
	}
	
	public void listarPaises() {
		paisView.exibirListaDePaises(paisDAO.listarPaises());
	}

	public void removerPais(Integer id) {
		Pais pais = paisDAO.buscarPaisPorId(id);

		boolean paisRemovido = paisDAO.removerPais(pais);
		paisView.removerPais(paisRemovido);
	}

	public void fecharPaisDAO() {
        	paisDAO.fechar();
        }
}
