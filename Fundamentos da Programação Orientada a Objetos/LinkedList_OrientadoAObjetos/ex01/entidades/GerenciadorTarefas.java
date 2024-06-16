package entidades;

import java.util.LinkedList;

public class GerenciadorTarefas {
	 private LinkedList<Tarefa> listaTarefas;

	    public GerenciadorTarefas() {
	        listaTarefas = new LinkedList<Tarefa>();
	    }

	    public void adicionarTarefa(Tarefa tarefa) {
	        listaTarefas.add(tarefa);
	    }

	    public void removerTarefa(int indice) {
	        listaTarefas.remove(indice);
	    }

	    public void listarTarefas() {
	        for (Tarefa tarefa : listaTarefas) {
	            System.out.println("Título: " + tarefa.getTitulo() + 
	            		", Descrição: " + tarefa.getDescricao());
	        }
	    }
}
