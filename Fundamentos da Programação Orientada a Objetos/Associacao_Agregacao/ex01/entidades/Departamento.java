package entidades;

public class Departamento {
    private String nome;
    private String sigla;
    private int numeroColaboradores;
    private Colaborador colaborador;
    
    public Departamento(String nome, String sigla, int numeroColaboradores, Colaborador colaborador) {
        this.nome = nome;
        this.sigla = sigla;
        this.numeroColaboradores = numeroColaboradores;
        this.colaborador = colaborador;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSigla() {
        return sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    public int getNumeroColaboradores() {
        return numeroColaboradores;
    }
    
    public void setNumeroColaboradores(int numeroColaboradores) {
        this.numeroColaboradores = numeroColaboradores;
    }
    
    public Colaborador getColaborador() {
        return colaborador;
    }
    
    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome do departamento: " + nome);
        System.out.println("Sigla: " + sigla);
        System.out.println("Número de colaboradores: " + numeroColaboradores);
        System.out.println("Informações do colaborador:");
        colaborador.exibirInformacoes();
    }
}
