package principal;

import java.util.Scanner;

import entidades.CarrinhoDeCompras;
import entidades.Produto;

public class Principal {
	public static void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Exibir produtos do carrinho");
        System.out.println("4 - Sair");
        System.out.print("\nEscolha uma opção: ");
    } 
	
	public static void main(String[] args) {
	        Scanner lerDados = new Scanner(System.in);
	        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	        int opcao;
	        
	        do {
	            exibirMenu();
	            opcao = lerDados.nextInt();
	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do produto: ");
	                    lerDados.nextLine();
	                    String nomeProduto = lerDados.nextLine();
	                    System.out.print("Digite o preço do produto: ");
	                    double precoProduto = lerDados.nextDouble();
	                    System.out.print("Digite a quantidade de produtos: ");
	                    int quantidadeProduto = lerDados.nextInt();
	                    Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
	                    carrinho.adicionarProduto(produto);
	                    System.out.println("Produto adicionado ao carrinho.");
	                    break;
	                case 2:
	                    System.out.print("Digite o nome do produto a ser removido: ");
	                    lerDados.nextLine();
	                    String nomeRemover = lerDados.nextLine();
	                    carrinho.remover(nomeRemover);
	                    break;
	                case 3:
	                    carrinho.exibirProdutos();
	                    break;
	                case 4:
	                    System.out.println("Saindo do programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida, tente novamente.");
	            }
	        } while (opcao != 4);
	        
	        
	        lerDados.close();
	    }

}