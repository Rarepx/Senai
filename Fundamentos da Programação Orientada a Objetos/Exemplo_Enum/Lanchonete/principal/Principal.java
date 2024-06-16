package principal;

import java.util.Scanner;
import entidade.Bebidas;
import entidade.Lanches;

public class Principal {

	public static void menuBebida() {

		System.out.println("Bebidas");
		System.out.println("1 - " + Bebidas.CAFE.getNome() + ": R$ " + Bebidas.CAFE.getPreco());
		System.out.println("2 - " + Bebidas.SUCO.getNome() + ": R$ " + Bebidas.SUCO.getPreco());
		System.out.println("3 - " + Bebidas.AGUA.getNome() + ": R$ " + Bebidas.AGUA.getPreco());
		System.out.println("4 - " + Bebidas.REFRIGERANTE.getNome() + ": R$ " + Bebidas.REFRIGERANTE.getPreco());
		
		System.out.println("0. Sair");
		System.out.print("\nEscolha sua opção: ");
	}

	public static void menuLanche() {

		System.out.println("Lanches");
		System.out.println("1 - " + Lanches.SANDUICHE.getNome() + ": R$ " + Lanches.SANDUICHE.getPreco());
		System.out.println("2 - " + Lanches.HOTDOG.getNome() + ": R$ " + Lanches.HOTDOG.getPreco());
		System.out.println("3 - " + Lanches.XBURGER.getNome() + ": R$ " + Lanches.XBURGER.getPreco());

		System.out.println("0. Sair");
		System.out.print("\nEscolha sua opção: ");
	}

	public static double precoBebida(int opcao) {
		switch (opcao) {
		  case 1:
			return Bebidas.CAFE.getPreco();
		  case 2:
			return Bebidas.SUCO.getPreco();
		  case 3:
			return Bebidas.AGUA.getPreco();
		  case 4:
			return Bebidas.REFRIGERANTE.getPreco();
		  default:
			return 0.0;

		}
	}

	public static double precoLanche(int opcao) {
		switch (opcao) {
		  case 1:
			return Lanches.SANDUICHE.getPreco();
		  case 2:
			return Lanches.HOTDOG.getPreco();
		  case 3:
			return Lanches.XBURGER.getPreco();
		  default:
			return 0.0;
		}
	}

	public static void main(String[] args) {
		double total = 0.0;
		char verificar='s';
		int opcaoBebida = 0, opcaoLanche = 0;
		Scanner lerDados = new Scanner(System.in);
		
		do {
			menuBebida();
			opcaoBebida = lerDados.nextInt();
			menuLanche();
			opcaoLanche = lerDados.nextInt();

			total += precoBebida(opcaoBebida) + precoLanche(opcaoLanche);
			System.out.println("\nOpção escolhida Bebida: " + opcaoBebida);
			System.out.println("Opção escolhida Lanche: " + opcaoLanche);
			System.out.println("Valor de sua conta: " + total + "\n");
			
			
			System.out.printf("Deseja fazer uma nova compra s/n:");
			verificar = lerDados.next().charAt(0);
			if(verificar != 's') {
				break;
			}
			
		} while (opcaoBebida != 0);
		lerDados.close();

	}
}
