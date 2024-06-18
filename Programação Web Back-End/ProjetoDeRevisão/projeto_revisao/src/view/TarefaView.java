package view;

import model.Tarefa;
import java.util.List;

public class TarefaView {
    public void exibeTarefa(Tarefa tarefa) {
        System.out.print("ID da Tarefa: " + tarefa.getId_Tarefa());
        System.out.print(" - T�tulo: " + tarefa.getTitulo());
        System.out.print(" - Descri��o: " + tarefa.getDescricao());
        System.out.println(" - Status: " + tarefa.getStatus());
    }

    public void listaTarefa(List<Tarefa> tarefas) {
        for (Tarefa tarefa : tarefas) {
        	exibeTarefa(tarefa);
        }
    }
}
