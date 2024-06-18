import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais> listaDePaises = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("==== Menu ====");
            System.out.println("1. Adicionar país");
            System.out.println("2. Exibir lista de países");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do país: ");
                    scanner.nextLine(); // Consumir o '\n' após a leitura do número
                    String nome = scanner.nextLine();
                    Pais pais = new Pais(nome);
                    listaDePaises.add(pais);
                    break;
                case 2:
                    System.out.println("==== Lista de Países ====");
                    System.out.println("--------------------");
                    
                    for (Pais p : listaDePaises) {
                        System.out.println("País: " + p.getNome());
                    }

                    System.out.println("--------------------");
                    break;
                case 0:
                	scanner.close();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
