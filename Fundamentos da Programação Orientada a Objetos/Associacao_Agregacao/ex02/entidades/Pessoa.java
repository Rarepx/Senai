package entidades;

public class Pessoa {
	 private String nome;
	 private int idade;
	 private int identificacao;
	 private Endereco endereco;
	    
	    public Pessoa(String nome, int idade, int identificacao, Endereco endereco) {
	        this.nome = nome;
	        this.idade = idade;
	        this.identificacao = identificacao;
	        this.endereco = endereco;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public int getIdentificacao() {
	        return identificacao;
	    }

	    public void setIdentificacao(int identificacao) {
	        this.identificacao = identificacao;
	    }

	    public Endereco getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(Endereco endereco) {
	        this.endereco = endereco;
	    }

	    @Override
	    public String toString() {
	        return "Pessoa{" +
	                "Nome: '" + nome + '\'' +
	                ", Idade: " + idade +
	                ", Identificacao: " + identificacao +
	                ", \nEndereco: " + endereco +
	                '}';
	    }
	}
