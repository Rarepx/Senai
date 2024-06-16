package principal;

import java.util.Scanner;
import entidades.TipoProduto;
import entidades.Produto;
import entidades.Loja;
import entidades.Venda;

public class Principal {
	public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        Loja loja = new Loja();
        boolean executando = true;
        
        Produto p1 = new Produto(1, "Fones de ouvido", TipoProduto.FONES, 4);
        Produto p2 = new Produto(2, "Notebook Dell", TipoProduto.NOTEBOOK, 10);
        Produto p3 = new Produto(3, "Impressora HP", TipoProduto.IMPRESSORA, 5);
        Produto p4 = new Produto(4, "Monitor LG",TipoProduto.MONITOR, 12);
        
        loja.cadastrarProduto(p1);
        loja.cadastrarProduto(p2);
        loja.cadastrarProduto(p3);
        loja.cadastrarProduto(p4);

        while (executando) {
            System.out.println("Digite 1 para cadastrar um novo produto.");
            System.out.println("Digite 2 para realizar uma venda.");
            System.out.println("Digite 3 para exibir os produtos.");
            System.out.println("Digite 4 para sair.");
            System.out.print("Opcao: ");

            int opcao = lerDados.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o codigo do produto: ");
                    int codigo = lerDados.nextInt();
                    lerDados.nextLine();
                    System.out.print("Digite a descricao do produto: ");
                    String descricao = lerDados.nextLine();

                    System.out.print("Digite o tipo do produto: ");
                    TipoProduto tipo = TipoProduto.valueOf(lerDados.next().toUpperCase());
                    
                    System.out.print("Quantidade de produtos: ");
                    int quantidade = lerDados.nextInt();
                    
                    Produto p5 = new Produto(codigo, descricao, tipo, quantidade );
                    loja.cadastrarProduto(p5);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o tipo do produto a ser vendido: ");
                    TipoProduto tipoProduto = TipoProduto.valueOf(lerDados.next().toUpperCase());

                    System.out.print("Digite a quantidade desejada: ");
                    int quantidadeProduto = lerDados.nextInt();

                    Venda venda = new Venda(tipoProduto, quantidadeProduto);
                    double valorTotal = venda.finalizarVenda(tipoProduto, quantidadeProduto);

                    if (valorTotal == -1) {
                        System.out.println("Tipo de produto invalido!");
                    } else if (valorTotal == -2) {
                        System.out.println("Quantidade de produtos indisponível!");
                    } else {
                        System.out.printf("Valor total da venda: R$ %.2f%n", valorTotal);
                    }
                    break;

                case 3:
                    loja.listarProdutos();
                    break;
                
                case 4:
                    executando = false;
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        lerDados.close();
    }
}
