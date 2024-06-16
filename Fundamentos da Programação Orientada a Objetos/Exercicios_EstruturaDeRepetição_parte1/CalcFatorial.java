package lacoWhile;

import java.util.Scanner;

public class CalcFatorial {
	public static void main(String[] args) {
	  int numero, fatorial = 1, cont = 1;   
	  Scanner lerDados = new Scanner(System.in);
          
	  System.out.println("Informe um número: ");
          numero = lerDados.nextInt();
          
          while( numero < 0) {
        	 System.out.println("O número deve ser maior ou igual a 0: ");
        	 System.out.println("Informe outro número: ");
        	 numero = lerDados.nextInt();
          }
         
          do{
             for(int i = 1; i <= numero; i++){
            	fatorial = fatorial * i;
             }
            
             System.out.println("Fatorial de !" + numero + " = " + fatorial);
             cont++;
          }while(cont < 2);
       
          lerDados.close(); 
        }
}
