package entidades;

public class Funcionario {
    private String nome;
    private int idade;
    private String cpf;
    private double cargaHoraria;
    private String descricaoAtividade;

    public Funcionario(String nome, int idade, String cpf, double cargaHoraria, String descricaoAtividade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cargaHoraria = cargaHoraria;
        this.descricaoAtividade = descricaoAtividade;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("Descricao da Atividade: " + descricaoAtividade);
    }

    @Override
    public String toString() {
        return "Funcionario[ " +
                " Nome: " + nome + ", Idade: " + idade +
                ", CPF: " + cpf + ", Carga Horaria: " + cargaHoraria +
                ", Descricao Atividade: " + descricaoAtividade+"]";
    }
}