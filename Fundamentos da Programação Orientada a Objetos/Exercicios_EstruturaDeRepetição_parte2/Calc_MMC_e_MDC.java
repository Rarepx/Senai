package metodos;

import java.util.Scanner;

public class Calc_MMC_e_MDC {
	
     public static int calcularMMC(int num1, int num2) {
           int mmc = 1, divisor = 2, resto1, resto2;
        
           while (num1 != 1 || num2 != 1) {
           	resto1 = (num1 % divisor);
           	resto2 = (num2 % divisor);
        	
           	if((resto1 == 0) || (resto2 == 0)) {
                   mmc = mmc * divisor;
                
                   if (resto1 == 0) {
                	num1 = (num1/divisor);
                   }
                   if (resto2 == 0) {
                	num2 = (num2/divisor);
                   }
                }
        	else {
                  divisor++;
                }
           }
        
        return mmc;
     }
    
     public static int calcularMDC(int num1, int num2) {
        int resto;
        
        resto = (num1 % num2);
        
        while (resto != 0) {
           num1 = num2;
           num2 = resto;
           resto = num1 % num2;
        }
        return num2;
     }

	
     public static void main(String[] args) {
	int opcao = 0, num1, num2, num3, num4, mmc, mdc;
	Scanner lerTeclado = new Scanner(System.in);
        
        
        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - para calcular MMC");
            System.out.println("2 - para calcular MDC");
            System.out.println("3 - para sair");
            System.out.print("Opção escolhida: ");
            opcao = lerTeclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerTeclado.nextInt();
                    
                    System.out.print("Digite o segundo número: ");
                    num2 = lerTeclado.nextInt();
                    
                    mmc = calcularMMC(num1, num2);
                    System.out.println("MMC entre " + num1 + " e " + num2 + " = " + mmc);
                    break;
                    
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num3 = lerTeclado.nextInt();
                    
                    System.out.print("Digite o segundo número: ");
                    num4 = lerTeclado.nextInt();
                    
                    mdc = calcularMDC(num3, num4);
                    System.out.println("MDC entre " + num3 + " e " + num4 + " = " + mdc);
                    break;
                    
                case 3:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        }
        lerTeclado.close();
    }
    
    
}
