package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Produto;
import entidades.Produtos;

public class Principal {
	
	public static void menu() {
        System.out.println("===== Controle de Estoque =====");
        System.out.println("1 Adicionar produto");
        System.out.println("2 Remover produto");
        System.out.println("3 Listar produtos");
        System.out.println("4 Sair");
	}
	
	 private static void adicionarProduto(Produtos estoque, Scanner lerDados) {
	        System.out.println("===== Adicionar Produto =====");

	        try {
	            System.out.print("Nome: ");
	            String nome = lerDados.nextLine();
	            System.out.print("Quantidade: ");
	            int quantidade = lerDados.nextInt();
	            System.out.print("Código: ");
	            int codigo = lerDados.nextInt();
	            System.out.print("Preço: ");
	            double preco = lerDados.nextDouble();

	            Produto produto = new Produto(nome, quantidade, codigo, preco);
	            estoque.adicionar(produto);
	            
	        } catch (InputMismatchException e) {
	            System.out.println("Entrada inválida. Tente novamente.");
	            lerDados.nextLine(); 
	        }
	    }

	    private static void removerProduto(Produtos estoque, Scanner scanner) {
	        System.out.println("===== Remover Produto =====");

	        try {
	            System.out.print("Código do produto a ser removido: ");
	            int codigo = scanner.nextInt();
	            estoque.remover(codigo);
	        } catch (InputMismatchException e) {
	            System.out.println("Entrada inválida. Tente novamente.");
	            scanner.nextLine(); // Limpar o buffer
	        }
	    }

	    private static void listarProdutos(Produtos estoque) {
	        System.out.println("===== Listar Produtos =====");
	        estoque.listarProdutos();
	    }
	
	public static void main(String[] args) {
		int opcao = 0;
		Produtos estoque = new Produtos();
        Scanner lerDados = new Scanner(System.in);
        
        do {
            try {
            	menu();
                System.out.println("Informe uma das opcoes: ");
                opcao = lerDados.nextInt();
                lerDados.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarProduto(estoque, lerDados);
                        break;
                    case 2:
                        removerProduto(estoque, lerDados);
                        break;
                    case 3:
                        listarProdutos(estoque);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                lerDados.nextLine(); // Limpar o buffer
            }
        }while (opcao != 4);

        System.out.println("Encerrando o programa...");
        lerDados.close();
    }

}
