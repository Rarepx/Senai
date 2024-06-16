package casosComIF_ELSE;

import java.util.Scanner;

public class VerificaSePrimo {

     public static void main(String[] args) {
	int numero, restoDivisao, resultadoDiv, i = 2;;
	boolean primo = true;
	Scanner lerDados = new Scanner(System.in);

        // lê o número
        System.out.println("Digite um número inteiro:");
        numero = lerDados.nextInt();
        
        do{
        	restoDivisao = numero % i;
        	if (restoDivisao == 0) {
                     primo = false;
                     break;
                }
        	resultadoDiv = numero / 2;
        	i++;
        }while(i <= resultadoDiv);

        // exibe o resultado na tela
        if (primo) {
            System.out.printf("%d é um número primo.\n", numero);
        } else {
            System.out.printf("%d não é um número primo.\n", numero);
        }

     }

}
