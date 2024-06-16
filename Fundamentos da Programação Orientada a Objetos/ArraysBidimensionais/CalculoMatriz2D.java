package exemploArrays2D;

public class CalculoMatriz2D {
	
	public static int []somaElementosLinhas(int[][] matriz2D) {
		int []arrayElementosSomadosLinhas = new int[matriz2D.length];
		
		for (int i = 0; i < matriz2D[0].length; i++) {
			for (int j = 0; j < matriz2D.length; j++) {
				arrayElementosSomadosLinhas[j] += matriz2D[i][j];
			}
		}
		
		return arrayElementosSomadosLinhas;
	}
	
	public static int []somaElementosColunas(int[][] matriz2D) {
		int []vetElementos = new int[matriz2D.length];
		
		for (int j = 0; j < matriz2D[0].length; j++) {
			for (int i = 0; i < matriz2D.length; i++) {
				vetElementos[i] += matriz2D[i][j];
			}
		}
		
		return vetElementos;
	}
	
	
	public static int somaElementos(int[][] matriz2D) {
		int somaDosElementos = 0;
		
		for (int i = 0; i < matriz2D.length; i++){
			for (int j = 0; j < matriz2D[i].length; j++){
				somaDosElementos += matriz2D[i][j];
			}
		}
		
		return somaDosElementos;
	}
	
	public static void exibirConteudoDoVetor(int []arrayDeElementos) {
		for(int i = 0; i < arrayDeElementos.length; i++) {
			System.out.printf("\n[%d]          %d",i,arrayDeElementos[i]);
		}
	}
	
	public static void main(String[] args) {
		int[][] matriz2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int somaDosElementos;
		int []arrayElementosSomadosColunas; 
		int []arrayElementosSomadosLinhas;
		
		somaDosElementos = somaElementos(matriz2D);
		System.out.print("\nSoma: " + somaDosElementos);
		
		arrayElementosSomadosColunas = somaElementosColunas(matriz2D);
		System.out.print("\nColuna -- Soma dos Elementos ");
		exibirConteudoDoVetor(arrayElementosSomadosColunas);
		
		arrayElementosSomadosLinhas = somaElementosLinhas(matriz2D);
		System.out.print("\n\nLinha -- Soma dos Elementos ");
		exibirConteudoDoVetor(arrayElementosSomadosLinhas);
	}
}
