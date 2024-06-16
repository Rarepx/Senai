package entidades;

public class  Colaborador {
    private int identificacao;
    private String nome;
    private int idade;
    private String cargo;
    
    public Colaborador(int identificacao, String nome, int idade, String cargo) {
        this.identificacao = identificacao;
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }
    
    public int getIdentificacao() {
        return identificacao;
    }
    
    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
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
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void exibirInformacoes() {
        System.out.println("Identificação: " + identificacao);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
    }
}