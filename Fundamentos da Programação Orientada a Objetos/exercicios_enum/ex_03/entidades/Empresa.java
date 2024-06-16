package entidades;

import java.util.LinkedList;

public class Empresa {
	    private LinkedList<Funcionario> funcionarios;

	    public Empresa() {
	        funcionarios = new LinkedList<>();
	    }

	    public void adicionarFuncionario(Funcionario funcionario) {
	        funcionarios.add(funcionario);
	    }

	    public void removerFuncionario(Funcionario funcionario) {
	        funcionarios.remove(funcionario);
	    }

	    public void listarFuncionarios() {
	    	for (Funcionario funcionario : funcionarios) {
	    		System.out.println(funcionario.toString());
	    	}
	    }
	    
	    public LinkedList<Funcionario> getFuncionariosPorDepartamento(Departamento departamento) {
	        LinkedList<Funcionario> listaFuncionarios = new LinkedList<>();

	        for (Funcionario funcionario : funcionarios) {
	            if (funcionario.getDepartamento() == departamento) {
	                listaFuncionarios.add(funcionario);
	            }
	        }
	        
	        return listaFuncionarios;
	    }
}
