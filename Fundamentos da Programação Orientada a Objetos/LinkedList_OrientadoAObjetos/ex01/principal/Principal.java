package principal;

import entidades.GerenciadorTarefas;
import entidades.Tarefa;


public class Principal {
	public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // adiciona algumas tarefas
        gerenciador.adicionarTarefa(new Tarefa("Comprar arroz", "Comprar arroz no mercado."));
        gerenciador.adicionarTarefa(new Tarefa("Fazer exercicio", "Fazer 30 minutos de exercicio fisico."));
        gerenciador.adicionarTarefa(new Tarefa("Ler livro", "Ler 20 paginas do livro \"O principe\"."));

        // listar todas as tarefas
        System.out.println("\nLista de tarefas:");
        gerenciador.listarTarefas();

        // remove uma tarefa
        gerenciador.removerTarefa(1);

        // listar as tarefas após remover uma tarefa
        System.out.println("\nLista de tarefas após remover uma tarefa:");
        gerenciador.listarTarefas();
    }
}
