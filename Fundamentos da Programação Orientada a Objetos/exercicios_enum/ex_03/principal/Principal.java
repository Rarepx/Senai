package principal;

import entidades.Empresa;
import entidades.Funcionario;
import entidades.Departamento;

public class Principal {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Funcionario("João", 2500.00, Departamento.VENDAS);
		Funcionario f2 = new Funcionario("Ana", 3500.00, Departamento.RH);
		Funcionario f3 = new Funcionario("Carlos", 3500.00, Departamento.RH);
		Funcionario f4 = new Funcionario("Pedro", 3000.00, Departamento.FINANCEIRO);
		Funcionario f5 = new Funcionario("Fernanda", 5000.00, Departamento.TECNOLOGIA);
		Funcionario f6 = new Funcionario("Jorge", 4000.00, Departamento.TECNOLOGIA);
		
		empresa.adicionarFuncionario(f1);
		empresa.adicionarFuncionario(f2);
		empresa.adicionarFuncionario(f3);
		empresa.adicionarFuncionario(f4);
		empresa.adicionarFuncionario(f5);
		empresa.adicionarFuncionario(f6);
		
		System.out.println("Listar Todos os Funcionarios: ");
		empresa.listarFuncionarios();
		
		System.out.println("Listar Funcionarios por Departamento de Tecnologia: ");
		System.out.println(empresa.getFuncionariosPorDepartamento(Departamento.TECNOLOGIA));
		
		System.out.println("Remover Funcionário: "+ f6.getNome());
		empresa.removerFuncionario(f6);
		System.out.println();
		System.out.println(empresa.getFuncionariosPorDepartamento(Departamento.TECNOLOGIA));
	}
}
