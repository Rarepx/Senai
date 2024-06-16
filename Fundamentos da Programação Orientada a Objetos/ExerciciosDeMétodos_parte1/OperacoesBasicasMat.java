package metodos;

import java.util.Scanner;

public class OperacoesBasicasMat {
	
	 public static double adicao(double num1, double num2){
		 return (num1 + num2);
	 }

	 public static double subtracao(double num1, double num2){
		 return (num1 - num2);
	 }

	 public static double multiplicacao(double num1, double num2){
		 return (num1 * num2);
	 }

	 public static double divisao(double num1, double num2){
		 
		 if (num2 == 0) {
			 System.out.println("Erro!!!\n Não é possível dividir por zero !!! \n");
			 return -1;
	     }else{
	         return (num1 / num2);
	     }
	 }
	    
	public static void main(String[] args) {
 		double num1, num2, resultadoAdicao, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao;   
		Scanner lerTeclado = new Scanner(System.in);

        	System.out.print("Digite o primeiro número: ");
        	num1 = lerTeclado.nextDouble();

        	System.out.print("Digite o segundo número: ");
        	num2 = lerTeclado.nextDouble();

        	resultadoAdicao = adicao(num1, num2);
        	resultadoSubtracao = subtracao(num1, num2);
        	resultadoMultiplicacao = multiplicacao(num1, num2);
        	resultadoDivisao = divisao(num1, num2);

        	System.out.println("Resultado da Adição: " + resultadoAdicao);
        	System.out.println("Resultado da Subtração: " + resultadoSubtracao);
        	System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
        
        	if(resultadoDivisao != -1) {
        		System.out.println("Resultado da Divisão: " + resultadoDivisao);
        	}
        
        	lerTeclado.close();
	}

}
