package entradaSaidaDeDados;

import java.util.Scanner;

public class calcAreaCirculo {
	public static void main(String[] args) {
	     double raio, area;
	     Scanner lerRaio = new Scanner(System.in);
		
	     System.out.print("Informe o raio do circulo: ");
	     raio = lerRaio.nextDouble();
	
	     /** Math.PI representa a proporção entre circunferência 
		* de um círculo com o seu diâmetro, aproximadamente 3.14159...
		*
		* A função Math. pow() retorna a base elevada ao 
		* expoente power, ou seja, base,expoente 
	     **/	
	     //A = π r²
	     area = Math.PI * Math.pow(raio,2.0);
	     System.out.printf("Área do circulo: %.2f ",area);
	     
	     lerRaio.close();
	}
}
