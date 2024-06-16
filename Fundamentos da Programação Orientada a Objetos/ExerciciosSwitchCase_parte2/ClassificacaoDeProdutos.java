package casosComSwitch;

import java.util.Scanner;

public class ClassificacaoDeProdutos {
	  public static void main(String[] args) {
	      int codigo;  
	      String classificacao;	
	      Scanner lerDados = new Scanner(System.in);

		  
	      // lê o código do produto
	      System.out.println("Digite o código do produto:");
	      codigo = lerDados.nextInt();

	      // verifica a classificação do produto
	      switch (codigo) {
	       		case 1:
	                classificacao = "Alimento não-perecível";
	                break;
	            case 2:
	            case 3:
	            case 4:
	                classificacao = "Alimento perecível";
	                break;
	            case 5:
	            case 6:
	                classificacao = "Vestuário";
	                break;
	            case 7:
	                classificacao = "Higiene Pessoal";
	                break;
	            case 8:
	            case 9:
	            case 10:
	            case 11:
	            case 12:
	            case 13:
	            case 14:
	            case 15:
	                classificacao = "Limpeza e Utensilios Domésticos";
	                break;
	            default:
	                classificacao = "Código Inválido";
	                break;
	      }

	       // exibe a classificação na tela
	       System.out.printf("O produto de código %d é classificado como %s.\n", codigo, classificacao);
	       lerDados.close();	  
	    }
	}
