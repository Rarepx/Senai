package principal;

import entidades.Bebida;
import entidades.Lanchonete;
import entidades.TipoBebida;

public class Principal {
	  public static void main(String[] args) {
	        Lanchonete lanchonete = new Lanchonete();
	        
	        Bebida refrigerante = new Bebida(TipoBebida.REFRIGERANTE, 4);
	        Bebida suco = new Bebida(TipoBebida.SUCO, 5);
	        Bebida cha = new Bebida(TipoBebida.CHA, 3);
	        
	        lanchonete.adicionarBebida(refrigerante);
	        lanchonete.adicionarBebida(suco);
	        lanchonete.adicionarBebida(cha);
	        lanchonete.exibirBebidas();
	        lanchonete.removerBebida(cha);
	        lanchonete.exibirBebidas();
	        
	        System.out.println("\nPreco Refrigerante: "+refrigerante.getTipoBebida().getPreco());
	        System.out.println("Quantidade de Refrigereantes: "+refrigerante.getQuantidade());
	        
	        System.out.println("Preco Suco: "+suco.getTipoBebida().getPreco());
	        System.out.println("Quantidade de Sucos: "+suco.getQuantidade());
	        
	        
	        System.out.println("Valor Final: "+lanchonete.precoFinal());
	        
	    }
}
