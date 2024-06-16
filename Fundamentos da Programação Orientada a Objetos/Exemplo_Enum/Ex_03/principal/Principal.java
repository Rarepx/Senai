package principal;

import entidades.ModalidadeCorrida;

public class Principal {
	public static void main(String[] args) {
		 ModalidadeCorrida modalidade = ModalidadeCorrida.RUA;
	     System.out.println("Modalidade escolhida: " + modalidade.getDescricao());
	}
}
