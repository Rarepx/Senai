package principal;

import entidades.Vendedor;
import entidades.Administrador;

public class Principal {
	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("João", "42183338", 2000, 2);
        vendedor.acumularVendas(1000);
        System.out.println("Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("RG: " + vendedor.getRg());
        System.out.println("Salário base: " + vendedor.getSalario());
        System.out.println("Vendas: " + vendedor.getVendas());
        System.out.println("Salário total: " + vendedor.calcularHolerite());
        
        Administrador administrador = new Administrador("Maria", "987654321", 3000);
        administrador.acumularHorasExtras(10);
        System.out.println("\nAdministrador:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("RG: " + administrador.getRg());
        System.out.println("Salário base: " + administrador.getSalario());
        System.out.println("Horas extras: " + administrador.getHorasExtras());
        System.out.println("Salário total: " + administrador.calcularHolerite());
  
	}
}
