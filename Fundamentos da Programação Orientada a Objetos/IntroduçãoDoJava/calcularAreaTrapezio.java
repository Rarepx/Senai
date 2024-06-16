package entradaSaidaDeDados;

import java.util.Scanner;

public class calcAreaTrapezio {
    public static void main(String[] args) {
	float area, baseMaior, baseMenor, altura;
		
	Scanner lerDado = new Scanner(System.in);
	System.out.println("Digite a Base Maior do trapézio: ");
        baseMaior = lerDado.nextFloat(); 
        
	System.out.println("Digite a Base Menor do trapézio: ");
        baseMenor = lerDado.nextFloat(); 
        
      	System.out.println("Digite a altura do trapézio: ");
      	altura = lerDado.nextFloat(); 
      	
      	area = ((baseMaior+baseMenor)*altura)/2;
      	System.out.println("Área do trapezio: ");
      	System.out.println(area);
      	  	
      	lerDado.close();
   }

}
