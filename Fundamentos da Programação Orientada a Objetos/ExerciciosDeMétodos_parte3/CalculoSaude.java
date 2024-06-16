package metodos;

import java.util.Scanner;

public class CalculoSaude {
	
	
	public static double calcularIMC(double peso, double altura) {
	      double imc;
		
              imc = (peso / (altura * altura));
              return imc;
    	}
	
	 public static double calcularCalorias(double peso, double altura, int idade, double sexo) {
	     double caloriasNecessarias;
		 
	     if (sexo == 1) {
			 caloriasNecessarias = (13.75 * peso) + (5 * altura) - (6.76 * idade) + 66.5;
	     } 
		 else if (sexo == 0) {
			 caloriasNecessarias = (9.56 * peso) + (1.85 * altura) - (4.68 * idade) + 665;
	     } 
		 else {
			 System.out.println("Sexo inválido!");
	         return 0;
	     }
	        return caloriasNecessarias;
	 }

	 public static double calcularPercentualGordura(double imc, int idade, int sexo) {
		double resultado;
		 	
		resultado = (1.20 * imc) + (0.23 * idade) - (10.8 * sexo) - 5.4;
	        return resultado;
	 }
	 
	 public static double calcMassaGorda(double peso, double percentualGordura) {
		double massaGorda; 
		massaGorda = peso * (percentualGordura / 100);
			
		return massaGorda;
	 }

	 public static double calcMassaMagra(double peso, double massaGorda) {
		 double massaMagra;
		 
		 massaMagra = peso - massaGorda;
		 return massaMagra;
	 }
	 
	public static void main(String[] args) {
	   int opcao = 0, idade, sexo;
		
	   double peso, altura, calorias, imc=0, percentualGordura, massaGorda, massaMagra;
	   Scanner scanner = new Scanner(System.in);
        
          do{
              System.out.println("Escolha uma opção:");
              System.out.println("1 - Calcular quantidade de calorias necessárias por dia");
              System.out.println("2 - Calcular IMC (Índice de Massa Corporal)");
              System.out.println("3 - Calcular percentual de Gordura");
              System.out.println("4 - Calcular Massa Magra");
              System.out.println("0 - Sair");
            
              opcao = scanner.nextInt();
            
              switch (opcao) {
                case 1:
                    System.out.println("Digite seu peso (em kg):");
                    peso = scanner.nextDouble();
                    
                    System.out.println("Digite sua altura (em cm):");
                    altura = scanner.nextDouble();
                    
                    System.out.println("Digite sua idade:");
                    idade = scanner.nextInt();
                    
                    System.out.println("Digite seu sexo (1 para masculino, 0 para feminino):");
                    sexo = scanner.nextInt();
                    
                    calorias = calcularCalorias(peso, altura, idade, sexo);
                    
                    System.out.println("Você precisa consumir " + calorias + " calorias por dia.");
                    break;
                    
                case 2:
                    System.out.println("Digite seu peso (em kg):");
                    peso = scanner.nextDouble();
                    
                    System.out.println("Digite sua altura (em metros):");
                    altura = scanner.nextDouble();
                    
                    imc = calcularIMC(peso, altura);
                    System.out.printf("Seu IMC é: %.2f \n" + imc);
                    break;
                    
                case 3:
                    System.out.println("Digite seu peso (em kg):");
                    peso = scanner.nextDouble();
                    
                    System.out.println("Digite sua altura (em metros):");
                    altura = scanner.nextDouble();
                    
                    System.out.println("Digite sua idade:");
                    idade = scanner.nextInt();
                    
                    System.out.println("Digite seu sexo (1 para masculino, 0 para feminino):");
                    sexo = scanner.nextInt();
                    
                    imc = calcularIMC(peso, altura);
                    percentualGordura = calcularPercentualGordura(imc, idade, sexo);
                    System.out.printf("Seu percentual de Gordura é: %.2f",percentualGordura);
                    break;
                    
                case 4:
                    System.out.println("Digite seu peso (em kg):");
                    peso = scanner.nextDouble();
                    
                    System.out.println("Digite sua altura (em metros):");
                    altura = scanner.nextDouble();
                    
                    System.out.println("Digite sua idade:");
                    idade = scanner.nextInt();
                    
                    System.out.println("Digite seu sexo (1 para masculino, 0 para feminino):");
                    sexo = scanner.nextInt();
                    
                    imc = calcularIMC(peso, altura);
                    percentualGordura = calcularPercentualGordura(imc, idade, sexo);
                    
                    massaGorda = calcMassaGorda(peso, percentualGordura);
                    massaMagra = calcMassaMagra(peso, massaGorda);
                    System.out.printf("Sua massa magra é: %.2f",massaMagra);
                    break;
                    
                case 0:
                    System.out.println("Encerrando...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
              }
            
          }while(opcao != 0);

        scanner.close();
    }

}
