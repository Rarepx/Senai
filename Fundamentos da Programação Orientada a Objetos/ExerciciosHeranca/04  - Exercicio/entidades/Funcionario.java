package entidades;

public class Funcionario {
	private String nome;
    private String rg;
    private float salario;
    
    //Construtor
    public Funcionario(String nome, String rg, float salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }
    
    //Setters and Getter
    public String getNome() {
        return nome;
    }
    
    public String getRg() {
        return rg;
    }
    
    public float getSalario() {
        return salario;
    }
    
    public float calcularHolerite() {
        return salario;
    }
}
