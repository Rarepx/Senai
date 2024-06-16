package principal;

import entidades.Produto;
import entidades.Pedido;

public class Principal {
	public static void main(String[] args) {
		 Produto produto = new Produto("Camiseta", 50, 1);
	     Pedido pedido = new Pedido("01/05/2023", 50, produto);
	     System.out.println(pedido.toString());
	}
}
