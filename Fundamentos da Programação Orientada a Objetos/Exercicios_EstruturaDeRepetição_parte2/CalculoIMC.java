package metodos;

import java.util.Scanner;

public class CalculoIMC {
    public static double calcularIMC(double peso, double altura) {
        double imc;
        
        imc = peso / (altura * altura);
	return imc;
    }
    
    public static double calcularCaloriasDiarias(double peso, double altura, int idade, char sexo) {
        double caloriasDiarias;
        
    	if(sexo == 'M'){
    		caloriasDiarias = (13.75 * peso) + (5 * (altura * 100)) - (6.76 * idade) + 66.5;
            return caloriasDiarias;
        } 
        else if(sexo == 'F'){
        	caloriasDiarias = (9.56 * peso) + (1.85 * (altura * 100)) - (4.68 * idade) + 665; 
            return caloriasDiarias;
        } 
        else{
            return 0;
        }
    }


	 
     public static void main(String[] args) {
             double peso, altura, imc, caloriasDiarias;
	     int idade;
	     char sexo;
		 
	     Scanner lerTeclado = new Scanner(System.in);
	        
	     System.out.print("Digite o seu peso em kg: ");
	     peso = lerTeclado.nextDouble();
	        
	     System.out.print("Digite a sua altura em metros: ");
	     altura = lerTeclado.nextDouble();
	     
	     System.out.print("Digite a sua idade em anos: ");
	     idade = lerTeclado.nextInt();
	     
	     System.out.print("Digite o seu sexo (M ou F): ");
	     sexo = lerTeclado.next().charAt(0);
	        
	     imc = calcularIMC(peso, altura);
	     caloriasDiarias = calcularCaloriasDiarias(peso, altura, idade, sexo);
	        
	     System.out.printf("\nSeu IMC é: %.2f\n",imc);
	     System.out.printf("Você precisa consumir %.2f", caloriasDiarias);
	     System.out.printf(" calorias por dia.");
	        
	     lerTeclado.close(); 
    }
}
