package metodos;

import java.util.Scanner;

public class CalculoDeterminanteOrdem3 {

    public static double calcularDeterminante(double[][] matriz) {
        double determinante = 0;
        
        for (int i = 0; i < 3; i++) {
            determinante = determinante + (matriz[0][i] * matriz[1][(i+1)%3] * matriz[2][(i+2)%3]);
            determinante = determinante - (matriz[0][i] * matriz[1][(i+2)%3] * matriz[2][(i+1)%3]);
        }
        return determinante;
    }

	
    public static void main(String[] args) {
	int contador = 0;
	double determinante;
	double[] numeros;
	double[][] matriz;
	Scanner lerDados = new Scanner(System.in);
		
        // Lê os números da sequência
        System.out.println("Digite a sequência de números para preencher a matriz:");
        numeros = new double[9];
        
        for (int i = 0; i < 9; i++) {
            numeros[i] = lerDados.nextDouble();
        }

        // Cria a matriz
        matriz = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = numeros[contador];
                contador++;
            }
        }

        // Calcula o determinante
        determinante = calcularDeterminante(matriz);

        // Exibe o resultado
        System.out.println("O determinante da matriz é: " + determinante);
        lerDados.close();
    }

}
