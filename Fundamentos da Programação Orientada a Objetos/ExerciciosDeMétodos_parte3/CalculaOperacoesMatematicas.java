package atividade;

import java.util.Scanner;

public class CalculaOperacoesMatematicas {
	
	public static void main(String[] args)  {
		int saida;
		float saidaOperacoes = 0;
		char verificar='n';
		Scanner lerTeclado = new Scanner(System.in);
		
		do {
			saida = menu(lerTeclado);
			if(saida == 9) {
				System.out.println("SAINDO... ");
				verificar = 's';
			}else {
				System.out.println("SAIDA: "+saida);
				saidaOperacoes = definirOperacao(saida, lerTeclado);
				System.out.println("saída: "+saidaOperacoes);
			}
		}while(verificar == 'n');
		lerTeclado.close();
	}
	
	public static float definirOperacao(int numero, Scanner lerTeclado) {
		float saida = 0, num1, num2;
		
		switch (numero) {
		case 1:
			System.out.println("Informe dois números: ");
			num1 = lerTeclado.nextFloat();
			num2 = lerTeclado.nextFloat();
			saida = soma(num1, num2);
			break;
			
		case 2:
			System.out.println("Informe dois números: ");
			num1 = lerTeclado.nextFloat();
			num2 = lerTeclado.nextFloat();
			saida = subtracao(num1, num2);
			break;
			
		case 3:
			System.out.println("Informe dois números: ");
			num1 = lerTeclado.nextFloat();
			num2 = lerTeclado.nextFloat();
			saida = divisao(num1, num2);
			break;
			
		case 4:
			System.out.println("Informe dois números: ");
			num1 = lerTeclado.nextFloat();
			num2 = lerTeclado.nextFloat();
			saida = multiplicacao(num1, num2);
			break;
			
		case 5:
			System.out.println("Informe um número: ");
			num1 = lerTeclado.nextFloat();
			saida = raiz(num1);
			break;
			
		case 6: 
			System.out.println("Informe dois números: ");
			num1 = lerTeclado.nextFloat();
			num2 = lerTeclado.nextFloat();
			saida = potencial(num1, num2);
			break;
			
		case 7:
			System.out.println("Informe um número: ");
			num1 = lerTeclado.nextFloat();
			saida = exponencial(num1);
			break;
			
		case 8: 
			System.out.println("Informe um número: ");
			num1 = lerTeclado.nextFloat();
			saida = log(num1);
			break;
			
		case 9:
			System.out.println("Informe um número: ");
			num1 = lerTeclado.nextFloat();
			saida = num1; 
			break;
			
		default:
			System.out.println("Opção Invalida!!! ");
		}
		
		return saida;
	}
	
	public static int menu(Scanner lerNumero) {
		int num = 0;
			do {
				System.out.println("=== Escolha uma das Opções Numéricas ===");
				System.out.println(" 1 - Adição (entre 2 números)");
				System.out.println(" 2 - Subtração (entre 2 números)");
				System.out.println(" 3 - Divisão (entre 2 números)");
				System.out.println(" 4 - Multiplicação (entre 2 números)");
				System.out.println(" 5 - Raiz Quadrada (de um número) ");
				System.out.println(" 6 - Potência (entre 2 números)");
				System.out.println(" 7 - Exponencial (de um número)");
				System.out.println(" 8 - Logaritmo (de um número)");
				System.out.println(" 9 - Sair");
				System.out.println("Informe uma opção: ");
				num = lerNumero.nextInt();
			}while((num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5) && (num != 6) && (num != 7) && (num != 8) && (num != 9));
			
			return num;
	}
	
	public static float potencial(float num, float numElevado) {
		float resultado = 0;
		resultado = (float)Math.pow(num, numElevado);
		
		return resultado;
	}
	
	public static float raiz(float num1) {
		float resultado = 0;
		resultado = (float)Math.sqrt(num1);
		
		return resultado;
	}
	
	public static float log(float numElevado) {
		float resultado = 0;
		
		resultado =  (float) Math.log(numElevado);
		return resultado;
	}
	
	public static float exponencial(float numElevado) {
		float resultado = 0;
		
		resultado =  (float) Math.exp(numElevado);
		return resultado;
	}	
	
	public static float soma(float num1, float num2) {
		float resultado = 0;
		
		resultado = (num1 + num2);
		return resultado;
	}
	
	public static float subtracao(float num1, float num2) {
		float resultado = 0;
		
		resultado = (num1 - num2);
		return resultado;
	}
	
	public static float multiplicacao(float num1, float num2) {
		float resultado = 0;
		
		resultado = (num1 * num2);
		return resultado;
	}
	
	public static float divisao(float num1, float num2) {
		float resultado = 0;
		
		if(num2 == 0) {
			System.out.println("Divisão por Zero não é permitido !!!");
			return 0;
		}else {
			resultado = (num1/num2);
			return resultado;
		}
	}
	
}
