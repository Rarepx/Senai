package metodos;

import java.util.Scanner;

public class OutrasOperacoesMat {
	
       public static int calcularFatorial(int num) {
       		int  fatorial = 1;
		
		if(num < 0){
                    System.out.println("Não é possível calcular o fatorial de um número negativo.");
                }
                 
                for(int i = 1; i <= num; i++){
                   fatorial = fatorial*i;
                }
       
          return fatorial;
       }

       public static int calcularRaiz(int num) {
             if (num < 0) {
        	System.out.println("Não é possível calcular a raiz quadrada de um número negativo.");
             }
             return ((int) Math.sqrt(num));
       }

       public static int calcularExponencial(int num) {
            return ((int) Math.exp(num));
       }
       	
       public static void main(String[] args) {
	    int fatorial, raiz, exponencial, num;	
	    Scanner lerTeclado = new Scanner(System.in);

	    System.out.print("Digite um número: ");
	    num = lerTeclado.nextInt();

	    fatorial = calcularFatorial(num);
	    raiz = calcularRaiz(num);
	    exponencial = calcularExponencial(num);

	    System.out.println("Fatorial de " + num + " é " + fatorial);
	    System.out.println("Raiz quadrada de " + num + " é " + raiz);
	    System.out.println("Exponencial de " + num + " é " + exponencial);

	    lerTeclado.close();
	}

}
