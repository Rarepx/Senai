package metodos;

import java.util.Scanner;

public class CalculaNumeros {
	
    public static int calcularSoma(int soma, int numero) {
        return soma + numero;
    }

    public static int calcularQuantidade(int quantidade) {
        return quantidade + 1;
    }

    public static double calcularMedia(int soma, int quantidade) {
        if (quantidade == 0) {
            return 0;
        }

        return ((double) soma / quantidade);
    }

    public static int calcularMaior(int maior, int numero) {
        return Math.max(maior, numero);
    }

    public static int calcularMenor(int menor, int numero) {
        return Math.min(menor, numero);
    }
	
    public static void main(String[] args) {
	int numero = 0, soma = 0, quantidade = 0;
	int maior = Integer.MIN_VALUE;
	int menor = Integer.MAX_VALUE;
	double media=0, mediaFinal; 
	        
	Scanner lerDados = new Scanner(System.in);
	        
	while(numero != -1){
	   System.out.print("Digite um número (ou -1 para sair): ");
	   numero = lerDados.nextInt();
          
	   if(numero != -1){
	      soma = calcularSoma(soma, numero);
	      quantidade = calcularQuantidade(quantidade);
	      maior = calcularMaior(maior, numero);
	      menor = calcularMenor(menor, numero);
	      media = calcularMedia(soma, quantidade);
	   }
        }
	        
	mediaFinal = calcularMedia(soma, quantidade);
           
	System.out.println("\n -- Resultados finais --");
	System.out.println("Soma: " + soma);
	System.out.println("Quantidade: " + quantidade);
	System.out.println("Média: " + mediaFinal);
	System.out.println("Maior número: " + maior);
	System.out.println("Menor número: " + menor);
	        
        lerDados.close();
    }


}
