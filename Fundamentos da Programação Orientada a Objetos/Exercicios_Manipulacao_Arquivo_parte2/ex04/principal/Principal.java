package principal;

import entidades.ManipularProdutos;

public class Principal {
	public static void main(String[] args) {
		String nomeArquivo = "arquivo.csv";

		ManipularProdutos manipularProdutos = new ManipularProdutos();		
		manipularProdutos.carregarProdutos(nomeArquivo);
		manipularProdutos.listarProdutos();
		
		
		int codigoRemover = 123;
		manipularProdutos.removerProduto(codigoRemover);
		manipularProdutos.atualizarArquivo(nomeArquivo);
		manipularProdutos.listarProdutos();
	}
}
