package view;

import java.util.List;

import model.Pessoa;

public class PessoaView {
    // Método para exibir os detalhes de uma pessoa
    public void exibirPessoa(Pessoa pessoa) {
        if (pessoa != null) {
            System.out.print("Nome: " + pessoa.getNome());
            System.out.print(" Sexo: " + pessoa.getSexo());
            System.out.print(" Altura: " + pessoa.getAltura() + " cm");
            System.out.print(" Idade: " + pessoa.getIdade() + " anos");
            System.out.print(" Peso: " + pessoa.getPeso() + " kg");
            System.out.println(" IMC: " + pessoa.getImc());
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }
    
    public void exibirListaDePessoas(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
        	exibirPessoa(pessoa);
        }
    }
    
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
