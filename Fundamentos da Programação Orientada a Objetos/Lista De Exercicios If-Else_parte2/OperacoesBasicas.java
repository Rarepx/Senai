package casosComIF_ELSE;

import java.util.Scanner;

public class OperacoesBasicas {
     public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        double num1, num2;
        double soma, subtracao, multiplicacao, divisao=0; 
        
        // lê os dois números
        System.out.println("Digite dois números:");
        num1 = lerDados.nextDouble();
        num2 = lerDados.nextDouble();

        // realiza as operações matemáticas
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        
        if (num2 != 0.0) {
            divisao = num1 / num2;
        }

        // exibe os resultados na tela
        System.out.printf("Soma = %.2f \n", soma);
        System.out.printf("Subtração = %.2f \n", subtracao);
        System.out.printf("Multiplicação = %.2f \n", multiplicacao);
        
        if (num2 != 0.0) {
            System.out.printf("Divisão = %.2f \n", divisao);
        } else {
            System.out.println("Divisão por zero não é permitida!");
        }
	lerDados.close();	
    }

}
