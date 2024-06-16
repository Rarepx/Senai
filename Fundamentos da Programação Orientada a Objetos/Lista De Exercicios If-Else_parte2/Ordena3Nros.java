package casosComIF_ELSE;

import java.util.Scanner;

public class Ordena3Nros {
     public static void main(String[] args) {
       	int nro1, nro2, nro3;
	int menor, maior, meio;
		
	Scanner lerDados = new Scanner(System.in);

        // lê os três valores inteiros
        System.out.println("Digite três valores inteiros (sem repetição):");
        nro1 = lerDados.nextInt();
        nro2 = lerDados.nextInt();
        nro3 = lerDados.nextInt();

        // verifica se não há valores iguais
        if (nro1 == nro2 || nro1 == nro3 || nro2 == nro3) {
            System.out.println("Os valores devem ser diferentes!");
        }

        // organiza os números em ordem crescente
        menor = Math.min(nro1, Math.min(nro2, nro3));
        maior = Math.max(nro1, Math.max(nro2, nro3));
        meio = nro1 + nro2 + nro3 - menor - maior;

        // exibe os números em ordem crescente
        System.out.printf("Os números em ordem crescente são: %d, %d, %d%n", menor, meio, maior);   
        lerDados.close();
     } 
}
