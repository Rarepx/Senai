package entidades;

public class Funcionario {
	    private String nome;
	    private double salario;
	    private Departamento departamento;

	    public Funcionario(String nome, double salario, Departamento departamento){
	        this.nome = nome;
	        this.salario = salario;
	        this.departamento = departamento;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public Departamento getDepartamento() {
	        return departamento;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public void setDepartamento(Departamento departamento) {
	        this.departamento = departamento;
	    }

		@Override
		public String toString() {
		  return "Funcionario: " + "Nome: " + nome + " Salario: " + salario + "\nDepartamento: " + departamento + "\n";
		}
	    
	    
}
