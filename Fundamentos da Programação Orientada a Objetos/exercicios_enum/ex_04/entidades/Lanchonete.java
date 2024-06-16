package entidades;

import java.util.ArrayList;

public class Lanchonete {

	private ArrayList<Bebida> bebidas;

	public Lanchonete() {
		bebidas = new ArrayList<Bebida>();
	}

	public void adicionarBebida(Bebida bebida) {
		bebidas.add(bebida);
	}

	public void removerBebida(Bebida bebida) {
		bebidas.remove(bebida);
	}

	public void exibirBebidas() {
		System.out.println("Bebidas disponíveis:");
		for (Bebida bebida : bebidas) {
			System.out.println(bebida.getTipoBebida() + " " + bebida.getTipoBebida().getPreco());
		}
	}
	
	public double precoFinal() {
		double valorFinal = 0 ;
		
		for (Bebida bebida : bebidas) {
			valorFinal = valorFinal+ (bebida.getTipoBebida().getPreco() * bebida.getQuantidade());
		}
		return valorFinal;
	}
	
}