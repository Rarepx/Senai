package principal;

import java.util.Scanner;
import entidade.DiasSemana;

public class Principal {

	public static int menu(Scanner lerNumero) {
		int num = 0;

		do {
			System.out.println("=== Escolha uma das Opções Numéricas ===");
			System.out.println(" 1 - Domingo");
			System.out.println(" 2 - Segunda-feira");
			System.out.println(" 3 - Terça-feira");
			System.out.println(" 4 - Quarta-feira");
			System.out.println(" 5 - Quinta-feira");
			System.out.println(" 6 - Sexta-feira");
			System.out.println(" 7 - Sábado");
			System.out.println(" 8 - Sair");
			System.out.println("Informe uma opção: ");
			num = lerNumero.nextInt();
		} while ((num != 1) && (num != 2) && (num != 3) && (num != 4) && (num != 5) && (num != 6) && (num != 7)
				&& (num != 8));

		return num;
	}
	
	public static String definirOperacao(int codigoDia) {
		String diaSemana;
		
		switch (codigoDia) {
		case 1:
			diaSemana = DiasSemana.DOMINGO.toString();
			break;
		case 2:
			diaSemana = DiasSemana.SEGUNDA.toString();
			break;
		case 3:
			diaSemana = DiasSemana.TERÇA.toString();
			break;
		case 4:
			diaSemana = DiasSemana.QUARTA.toString();
			break;
		case 5:
			diaSemana = DiasSemana.QUINTA.toString();
			break;
		case 6:
			diaSemana = DiasSemana.SEXTA.toString();
			break;
		case 7:
			diaSemana = DiasSemana.SÁBADO.toString();
			break;
		default:
			diaSemana = "Dia inválido";
		}
		return diaSemana;
	}
	
	public static void main(String[] args) {
		int saida = 0;
		String diaSemana;
		char verificar='n';
		
		Scanner lerTeclado = new Scanner(System.in);
		
		do {
			saida = menu(lerTeclado);
			if(saida == 8) {
				System.out.println("SAINDO... ");
				verificar = 's';
			}else {
				System.out.println("SAIDA: "+saida);
				diaSemana = definirOperacao(saida);
				System.out.printf("Dia de semana: %s \n\n",diaSemana);
			}
		}while(verificar == 'n');
		
		lerTeclado.close();
	}
}
