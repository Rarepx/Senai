package main;

import java.util.Scanner;

import controller.PessoaController;

public class Main {
    public static void main(String[] args) {
    	PessoaController pessoaController = new PessoaController();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("==== Menu ====");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Buscar Pessoa por Nome");
            System.out.println("4. Exibir a Maior Pessoa em Estatura");
            System.out.println("5. Exibir a Menor Pessoa em Estatura");
            System.out.println("6. Exibir a Pessoa com Maior IMC");
            System.out.println("7. Exibir a Pessoa com Menor IMC");
            System.out.println("8. Exibir a Pessoa com Maior Idade");
            System.out.println("9. Exibir a Pessoa com Menor Idade");
            System.out.println("10. Exibir a Pessoa com Maior Peso");
            System.out.println("11. Exibir a Pessoa com Menor Peso");
            System.out.println("12. Exibir a Média de Idade das Mulheres");
            System.out.println("13. Exibir a Média de Idade dos Homens");
            System.out.println("14. Exibir a Média de Altura das Mulheres");
            System.out.println("15. Exibir a Média de Altura dos Homens");
            System.out.println("16. Exibir a Quantidade de Mulheres Participantes");
            System.out.println("17. Exibir a Quantidade de Homens Participantes");
            System.out.println("18. Exibir a Quantidade de Participantes");
            System.out.println("19. Exibir Participantes em Ordem Alfabética");
            System.out.println("20. Exibir os 5 Participantes Mais Velhos");
            System.out.println("21. Exibir Participantes por IMC Mais Alto");
            System.out.println("22. Exibir Participantes com IMC Entre 18,5 e 24,9");
            System.out.println("23. Exibir Participantes maiores de 18 Anos");
            System.out.println("24. Exibir Participantes Homens, Maiores de 18 anos com IMC Maior que 27");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.next();
                    System.out.print("Digite o sexo da pessoa: ");
                    String sexo = scanner.next();
                    System.out.print("Digite a altura da pessoa (em metros): ");
                    double altura = scanner.nextDouble();
                    System.out.print("Digite a idade da pessoa: ");
                    int idade = scanner.nextInt();
                    System.out.print("Digite o peso da pessoa: ");
                    double peso = scanner.nextDouble();

                    pessoaController.adicionarPessoa(nome, sexo, altura, idade, peso);
                    break;
                case 2:
                    pessoaController.listarPessoas();
                    break;
                case 3:
                    System.out.print("Digite o nome da pessoa que deseja buscar: ");
                    String nomeBuscar = scanner.next();
                    pessoaController.exibirDetalhesPessoa(nomeBuscar);
                    break;
                    
                case 4:
                    pessoaController.exibirPessoaMaisAlta();
                    break;
                    
                case 5:
                    pessoaController.exibirPessoaMaisBaixa();
                    break;
                    
                case 6:
                    pessoaController.exibirPessoaMaiorIMC();
                    break;
                    
                case 7:
                    pessoaController.exibirPessoaMenorIMC();
                    break;
                    
                case 8:
                    pessoaController.exibirPessoaMaisVelha();
                    break;
                    
                case 9:
                    pessoaController.exibirPessoaMaisNova();
                    break;
                    
                case 10:
                    pessoaController.exibirPessoaMaisPesada();
                    break;
                    
                case 11:
                    pessoaController.exibirPessoaMaisLeve();
                    break;
                    
                case 12:
                    pessoaController.calcularMediaIdadeMulheres();
                    break;
                    
                case 13:
                    pessoaController.calcularMediaIdadeHomens();
                    break;
                    
                case 14:
                    pessoaController.calcularMediaAlturaMulheres();
                    break;
                    
                case 15:
                    pessoaController.calcularMediaAlturaHomens();
                    break;
                    
                case 16:
                    pessoaController.contarMulheres();
                    break;
                    
                case 17:
                    pessoaController.contarHomens();
                    break;
                    
                case 18:
                    pessoaController.contarParticipantes();
                    break;
                    
                case 19:
                    pessoaController.exibirEmOrdemAlfabetica();
                    break;
                    
                case 20:
                    pessoaController.exibirCincoMaisVelhos();
                    break;
                    
                case 21:
                    pessoaController.exibirPorIMCMaisAlto();
                    break;
                    
                case 22:
                    pessoaController.exibirParticipantesIMCNormal();
                    break;
                    
                case 23:
                    pessoaController.exibirMaioresDeDezoitoAnos();
                    break;
                    
                case 24:
                    pessoaController.exibirParticipantesHomens();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

