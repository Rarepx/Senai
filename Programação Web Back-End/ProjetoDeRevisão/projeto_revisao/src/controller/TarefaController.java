package controller;

import java.util.ArrayList;
import java.util.List;

import dao.TarefaDAO;
import model.Tarefa;
import model.Tarefa.Status;
import view.TarefaView;

public class TarefaController {
	private TarefaView tarefaView;
	private TarefaDAO tarefaDAO;

	public TarefaController() {
		tarefaView = new TarefaView();
		tarefaDAO = new TarefaDAO();
	}
	
	private int obtemMaiorIdTarefa() {
		return tarefaDAO.obtemMaiorIdTarefa();
	}

	public void adicionaTarefa(String titulo, String descricao, Status status) {
		Tarefa tarefa = new Tarefa(obtemMaiorIdTarefa(), titulo, descricao, status);
		tarefaDAO.adicionaTarefa(tarefa);
	}

	public void atualizaTarefa(int id_tarefa, String titulo, String descricao, Status status) {
		tarefaDAO.atualizaTarefa(id_tarefa, titulo, descricao, status);
	}

	public void finalizaTarefa(int id_tarefa) {
		tarefaDAO.finalizaTarefa(id_tarefa);
	}

	public void listaTarefa() {
		tarefaView.listaTarefa(tarefaDAO.listaTarefa());
	}

	public void excluiTarefa(int id_tarefa) {
		tarefaDAO.excluiTarefa(id_tarefa);
	}

}
