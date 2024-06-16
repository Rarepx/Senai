package principal;

import entidades.Livro;
import entidades.Eletronico;
import entidades.Vestuario;

public class Principal {
	public static void main(String[] args) {
		 Livro livro = new Livro(1, "Iracema", 30.0f, 0.1f, "Jose de Alencar", "Romantismo", "Editora Abril", 144, 1865);
	     Eletronico eletronico = new Eletronico(2, "Smartphone", 2000.0f, 0.20f, "110v");
	     Vestuario vestuario = new Vestuario(3, "Camiseta", 40.0f, 0.10f, "Camiseta preta", "M");

	     System.out.println("Informacoes sobre o Livro:");
	     livro.exibirInformacoes();
	     System.out.println("Valor final: R$ " + livro.calcularPreco());

	     System.out.println("\nInformacoes sobre o Eletrônico:");
	     eletronico.exibirInformacoes();
	     System.out.println("Valor final: R$ " + eletronico.calcularPreco());

	     System.out.println("\nInformacoes sobre o Vestuário:");
	     vestuario.exibirInformacoes();
	     System.out.println("Valor final: R$ " + vestuario.calcularPreco());
	}

}
