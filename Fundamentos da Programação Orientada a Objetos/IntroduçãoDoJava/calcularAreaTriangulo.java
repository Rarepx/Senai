package entradaSaidaDeDados;

import java.util.Scanner;

public class calcAreaTriangulo {
	public static void main(String[] args) {
	  float area, base, altura;
	  	
	  Scanner lerDado = new Scanner(System.in);
	  System.out.println("Digite a Base do Triângulo: ");
          base = lerDado.nextFloat(); 
          
	  System.out.println("Digite a Altura do Triângulo: ");
	  altura = lerDado.nextFloat(); 
		
      	  area = (base*altura)/2;
      	  System.out.println("Área do Triângulo: ");
      	  System.out.printf("%.2f",area);
      	
      	  lerDado.close();
	}
}
