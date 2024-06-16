package casosComIF_ELSE;

import java.util.Scanner;

public class MMC_2_Nros {

	public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        int num1, num2, mmc = 0, restoDivisao1, restoDivisao2;
        
        // lê os dois números
        System.out.println("Digite dois números inteiros positivos:");
        num1 = lerDados.nextInt();
        num2 = lerDados.nextInt();

        // calcula o MMC
        for (int i = 1; i <= num1 * num2; i++) {
            restoDivisao1 = i % num1;
            restoDivisao2 = i % num2;
        	if((restoDivisao1 == 0) && (restoDivisao2 == 0)) {
                mmc = i;
                break;
            }
        }

        // exibe o resultado na tela
        System.out.printf("O MMC de %d e %d é %d.\n", num1, num2, mmc);
        lerDados.close();
    }

}
