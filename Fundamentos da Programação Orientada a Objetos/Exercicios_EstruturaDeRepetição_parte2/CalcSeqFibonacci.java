package metodos;

import java.util.Scanner;

public class CalcSeqFibonacci {
	  public static int calcularFibonacci(int n) {
	      if(n < 2) {
		return n;
	      } 
	      //Formula Fn = Fn - 1 + Fn - 2
              else {
	    	return calcularFibonacci(n-1) + calcularFibonacci(n-2);
	      }
	  }
	
	public static void main(String[] args) {
            /**
             * Sequência de Fibonacci é a sequência numérica proposta 
	     * pelo matemático Leonardo Pisa, mais conhecido como Fibonacci:
	     * Seq: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	     * A sequência é definida mediante a seguinte fórmula:
	     * Fn = Fn - 1 + Fn - 2
	     **/ 
	    int numero;
            Scanner lerDados = new Scanner(System.in);
            
            System.out.print("Digite a quantidade de números de elementos que deseja exibir para a série de Fibonacci: ");
            numero = lerDados.nextInt();
            
            for(int i = 0; i < numero; i++) {
               System.out.print(calcularFibonacci(i) + " ");
            }
        
            lerDados.close();
       }
}
