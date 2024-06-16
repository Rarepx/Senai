package casosComSwitch;

import java.util.Scanner;

public class OperacoesComDoisNumeros {

    // método para calcular a média entre dois números
    public static double calcularMedia(double numero1, double numero2) {
        return (numero1 + numero2) / 2;
    }

    // método para calcular a diferença entre dois números
    public static double calcularDiferenca(double numero1, double numero2) {
        return numero1 - numero2;
    }

    // método para calcular o produto entre dois números
    public static double calcularProduto(double numero1, double numero2) {
        return numero1 * numero2;
    }

    // método para calcular a divisão do primeiro número pelo segundo
    public static double calcularDivisao(double numero1, double numero2) {
        return numero1 / numero2;
    }
	
	 public static void main(String[] args) {
	     int opcao;
             double numero1, numero2, media, diferenca, produto, divisao;
	     Scanner lerDados = new Scanner(System.in);

	        
	     System.out.println("Digite o primeiro número:");
	     numero1 = lerDados.nextDouble();

	     System.out.println("Digite o segundo número:");
	     numero2 = lerDados.nextDouble();

	     // apresenta o menu de operações
	     System.out.println("Escolha a operação desejada:");
	     System.out.println("1 - Calcular média");
	     System.out.println("2 - Calcular diferença");
	     System.out.println("3 - Calcular produto");
	     System.out.println("4 - Calcular divisão");

	     // lê a opção escolhida pelo usuário
	     opcao = lerDados.nextInt();

	     // executa a operação escolhida e exibe o resultado
	     switch (opcao) {
	            case 1:
	                media = calcularMedia(numero1, numero2);
	                System.out.printf("A média entre %.2f e %.2f é %.2f.%n", numero1, numero2, media);
	                break;
	                
	            case 2:
	                diferenca = calcularDiferenca(numero1, numero2);
	                System.out.printf("A diferença entre %.2f e %.2f é %.2f.%n", numero1, numero2, diferenca);
	                break;
	                
	            case 3:
	                produto = calcularProduto(numero1, numero2);
	                System.out.printf("O produto entre %.2f e %.2f é %.2f.%n", numero1, numero2, produto);
	                break;
	                
	            case 4:
	                if (numero2 != 0) {
	                    divisao = calcularDivisao(numero1, numero2);
	                    System.out.printf("A divisão de %.2f por %.2f é %.2f.%n", numero1, numero2, divisao);
	                } else {
	                    System.out.println("Erro: divisão por zero.");
	                }
	                break;
	            default:
	                System.out.println("Opção inválida.");
	                break;
	        }
		lerDados.close(); 
	    }

	
}
