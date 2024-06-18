package controller;

import java.util.Collections;
import java.util.List;

import dao.PessoaDAO;
import dao.PessoaDAOMySQL;
import model.Pessoa;
import view.PessoaView;

public class PessoaController {
    private PessoaDAOMySQL pessoaDAO;
    private PessoaView pessoaView;

    public PessoaController() {
        pessoaDAO = new PessoaDAOMySQL();
        pessoaView = new PessoaView();
        
        //criarBaseDeDados();
    }
    
    private void criarBaseDeDados() {
    	this.adicionarPessoa("Maria", "F", 1.60, 17, 60);
        this.adicionarPessoa("Wellington", "M", 1.75, 32, 100);
        this.adicionarPessoa("Vitória", "F", 1.55, 26, 55);
        this.adicionarPessoa("Cabral", "M", 1.80, 35, 85);
        this.adicionarPessoa("Clara", "F", 1.62, 29, 58);
        this.adicionarPessoa("Lincon", "M", 1.72, 16, 97);
        this.adicionarPessoa("Julia", "F", 1.58, 27, 57);
        this.adicionarPessoa("Carlos", "M", 1.78, 33, 95);
        this.adicionarPessoa("Larissa", "F", 1.63, 15, 63);
        this.adicionarPessoa("Hícaro", "M", 1.85, 38, 90);
        this.adicionarPessoa("Isabela", "F", 1.68, 18, 62);
        this.adicionarPessoa("Renan", "M", 1.76, 34, 79);
        this.adicionarPessoa("Mariana", "F", 1.59, 28, 56);
        this.adicionarPessoa("Rodrigo", "M", 1.81, 36, 128);
        this.adicionarPessoa("Laura", "F", 1.57, 25, 54);
    }

    // Adicionar uma nova pessoa
    public void adicionarPessoa(String nome, String sexo, double altura, int idade, double peso) {
        Pessoa novaPessoa = new Pessoa(nome, sexo, altura, idade, peso);
        pessoaDAO.criarPessoa(novaPessoa);
    }

    // Listar todas as pessoas
    public void listarPessoas() {
        pessoaView.exibirListaDePessoas(pessoaDAO.listarPessoas());
    }

    // Atualizar informações de uma pessoa
    public void atualizarPessoa(String nome, String sexo, double altura, int idade, double peso) {
        Pessoa pessoaAtualizada = new Pessoa(nome, sexo, altura, idade, peso);
        pessoaDAO.atualizarPessoa(pessoaAtualizada);
    }

    // Excluir uma pessoa
    public void excluirPessoa(String nome) {
    	Pessoa pessoa = pessoaDAO.buscarPessoaPorNome(nome);
        pessoaDAO.excluirPessoa(pessoa);
    }

    // Exibir os detalhes de uma pessoa
    public void exibirDetalhesPessoa(String nome) {
        Pessoa pessoa = pessoaDAO.buscarPessoaPorNome(nome);
        pessoaView.exibirPessoa(pessoa);
    }
    
    public void exibirPessoaMaisAlta() {
    	Pessoa pessoaMaisAlta = null;
        double alturaMaisAlta = 0.0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getAltura() > alturaMaisAlta) {
                alturaMaisAlta = pessoa.getAltura();
                pessoaMaisAlta = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMaisAlta);
    }
    
    public void exibirPessoaMaisBaixa() {
    	Pessoa pessoaMaisBaixa = null;
        double alturaMaisBaixa = Double.MAX_VALUE;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getAltura() < alturaMaisBaixa) {
            	alturaMaisBaixa = pessoa.getAltura();
                pessoaMaisBaixa = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMaisBaixa);
    }
    
    public void exibirPessoaMaiorIMC() {
    	Pessoa pessoaMaiorIMC = null;
        double maiorIMC = 0.0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getImc() > maiorIMC) {
            	maiorIMC = pessoa.getImc();
                pessoaMaiorIMC = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMaiorIMC);
    }
    
    public void exibirPessoaMenorIMC() {
    	Pessoa pessoaMenorIMC = null;
        double menorIMC = 0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getImc() < menorIMC) {
            	menorIMC = pessoa.getImc();
            	pessoaMenorIMC = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMenorIMC);
    }
    
    public void exibirPessoaMaisVelha() {
    	Pessoa pessoaMaisVelha = null;
        int maiorIdade = 0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getIdade() > maiorIdade) {
            	maiorIdade = pessoa.getIdade();
            	pessoaMaisVelha = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMaisVelha);
    }
    
    public void exibirPessoaMaisNova(){
    	Pessoa pessoaMaisNova = null;
        int menorIdade = Integer.MAX_VALUE;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getIdade() < menorIdade) {
            	menorIdade = pessoa.getIdade();
            	pessoaMaisNova = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMaisNova);
    }
    
    public void exibirPessoaMaisPesada() {
    	Pessoa pessoaMaisPesada = null;
        double maiorPeso = 0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getPeso() > maiorPeso) {
            	maiorPeso = pessoa.getPeso();
            	pessoaMaisPesada = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMaisPesada);
    }
    
    public void exibirPessoaMaisLeve() {
    	Pessoa pessoaMaisLeve = null;
        double menorPeso = Double.MAX_VALUE;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getPeso() < menorPeso) {
            	menorPeso = pessoa.getPeso();
            	pessoaMaisLeve = pessoa;
            }
        }

    	pessoaView.exibirPessoa(pessoaMaisLeve);
    }
    
    public void calcularMediaIdadeMulheres() {
        int totalMulheres = 0;
        int somaIdadeMulheres = 0;
        double mediaIdadeMulheres = 0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getSexo().equalsIgnoreCase("F")) {
                totalMulheres++;
                somaIdadeMulheres += pessoa.getIdade();
            }
        }

        if (totalMulheres > 0) {
        	mediaIdadeMulheres = (double) somaIdadeMulheres / totalMulheres;
        } else {
        	mediaIdadeMulheres = 0.0; // Retorna 0 se não houver mulheres no banco de dados.
        }
        
        pessoaView.exibirMensagem("A média de idades das mulheres é " + mediaIdadeMulheres + " anos.");
    }
    
    public void calcularMediaIdadeHomens() {
        int totalHomens = 0;
        int somaIdadeHomens = 0;
        double mediaIdadeHomens = 0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getSexo().equalsIgnoreCase("M")) {
            	totalHomens++;
            	somaIdadeHomens += pessoa.getIdade();
            }
        }

        if (totalHomens > 0) {
        	mediaIdadeHomens = (double) somaIdadeHomens / totalHomens;
        } else {
        	mediaIdadeHomens = 0.0; // Retorna 0 se não houver homens no banco de dados.
        }
        
        pessoaView.exibirMensagem("A média de idades dos homens é " + mediaIdadeHomens + " anos.");
    }
    
    public void calcularMediaAlturaMulheres() {
        int totalMulheres = 0;
        double somaAlturaMulheres = 0.0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getSexo().equalsIgnoreCase("F")) { // Verifica se o sexo é feminino
                somaAlturaMulheres += pessoa.getAltura();
                totalMulheres++;
            }
        }

        if (totalMulheres == 0) {
            pessoaView.exibirMensagem("Não há mulheres na lista."); // Exibe uma mensagem se não houver mulheres
            return;
        }

        double mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;
        pessoaView.exibirMensagem("Média de altura das mulheres: " + mediaAlturaMulheres + " metros.");
    }
    
    public void calcularMediaAlturaHomens() {
        int totalHomens = 0;
        double somaAlturaHomens = 0.0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getSexo().equalsIgnoreCase("M")) { // Verifica se o sexo é masculino
            	somaAlturaHomens += pessoa.getAltura();
                totalHomens++;
            }
        }

        if (totalHomens == 0) {
            pessoaView.exibirMensagem("Não há homens na lista."); // Exibe uma mensagem se não houver mulheres
            return;
        }

        double mediaAlturaHomens = somaAlturaHomens / totalHomens;
        pessoaView.exibirMensagem("Média de altura dos homens: " + mediaAlturaHomens + " metros.");
    }
    
    public void contarMulheres() {
        int totalMulheres = 0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getSexo().equalsIgnoreCase("F")) { // Verifica se o sexo é feminino
                totalMulheres++;
            }
        }

        pessoaView.exibirMensagem("O número de participantes mulheres é " + totalMulheres + ".");
    }
    
    public void contarHomens() {
        int totalHomens = 0;

        for (Pessoa pessoa : pessoaDAO.listarPessoas()) {
            if (pessoa.getSexo().equalsIgnoreCase("F")) { // Verifica se o sexo é feminino
            	totalHomens++;
            }
        }

        pessoaView.exibirMensagem("O número de participantes homens é " + totalHomens + ".");
    }
    
    public void contarParticipantes() {
    	pessoaView.exibirMensagem("O número de participantes é " + pessoaDAO.listarPessoas().size() + ".");
    }
    
    public void exibirEmOrdemAlfabetica() {
        List<Pessoa> pessoas = pessoaDAO.listarPessoas(); // Obtenha a lista de pessoas do DAO
        
        Collections.sort(pessoas, (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
        
        for (Pessoa pessoa : pessoas) {
            pessoaView.exibirPessoa(pessoa);
        }
    }
    
    public void exibirCincoMaisVelhos() {
        List<Pessoa> pessoas = pessoaDAO.listarPessoas(); // Obtenha a lista de pessoas do DAO
        
        Collections.sort(pessoas, (p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
       
        
        for (int i = 0; i < 5; i++) {
        	pessoaView.exibirPessoa(pessoas.get(i));
        }
    }
    
    public void exibirPorIMCMaisAlto() {
        List<Pessoa> pessoas = pessoaDAO.listarPessoas(); // Obtenha a lista de pessoas do DAO
        
        Collections.sort(pessoas, (p1, p2) -> Double.compare(p2.getImc(), p1.getImc()));
       
        for (Pessoa pessoa : pessoas) {
        	pessoaView.exibirPessoa(pessoa);
        }
    }
    
    public void exibirParticipantesIMCNormal() {
        List<Pessoa> pessoas = pessoaDAO.listarPessoas(); // Obtenha a lista de pessoas do DAO

        for (Pessoa pessoa : pessoas) {
            double imc = pessoa.getImc();
            if (imc >= 18.5 && imc <= 24.9) {
            	pessoaView.exibirPessoa(pessoa);
            }
        }
    }
    
    public void exibirMaioresDeDezoitoAnos() {
        List<Pessoa> pessoas = pessoaDAO.listarPessoas(); // Obtenha a lista de pessoas do DAO
        
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() >= 18) {
            	pessoaView.exibirPessoa(pessoa);
            }
        }
    }
    
    public void exibirParticipantesHomens() {
        List<Pessoa> pessoas = pessoaDAO.listarPessoas(); // Obtenha a lista de pessoas do DAO

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("M") && pessoa.getIdade() > 18 && pessoa.getImc() > 27) {
            	pessoaView.exibirPessoa(pessoa);
            }
        }
    }

}
