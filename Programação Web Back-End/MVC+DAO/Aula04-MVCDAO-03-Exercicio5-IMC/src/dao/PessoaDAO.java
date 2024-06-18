package dao;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class PessoaDAO {
    private List<Pessoa> bancoDeDados;

    public PessoaDAO() {
        bancoDeDados = new ArrayList<>();
    }

    // Método para criar uma nova pessoa
    public void criarPessoa(Pessoa pessoa) {
        bancoDeDados.add(pessoa);
    }

    // Método para ler uma pessoa pelo índice (supondo que os índices começam em 0)
    public Pessoa lerPessoa(int indice) {
        if (indice >= 0 && indice < bancoDeDados.size()) {
            return bancoDeDados.get(indice);
        } else {
            return null; // Retorna null se o índice estiver fora dos limites
        }
    }

    // Método para atualizar os dados de uma pessoa
    public boolean atualizarPessoa(Pessoa pessoa) {
        for (int i = 0; i < bancoDeDados.size(); i++) {
            Pessoa pessoaExistente = bancoDeDados.get(i);
            if (pessoaExistente.equals(pessoa)) {
                bancoDeDados.set(i, pessoa);
                return true; // Indica que a atualização foi bem-sucedida
            }
        }
        return false; // Indica que a pessoa não foi encontrada para atualização
    }

    // Método para excluir uma pessoa
    public void excluirPessoa(Pessoa pessoa) {
        bancoDeDados.remove(pessoa);
    }

    // Método para listar todas as pessoas no banco de dados
    public List<Pessoa> listarPessoas() {
        return bancoDeDados;
    }
    
    // Método para buscar pessoa por nome
    public Pessoa buscarPessoaPorNome(String nome) {
        for (Pessoa pessoa : bancoDeDados) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null; // Retorna null se a pessoa não for encontrada
    }
}

