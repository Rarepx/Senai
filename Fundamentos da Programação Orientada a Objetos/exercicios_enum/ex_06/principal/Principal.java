package principal;

import entidades.Produto;
import entidades.Supermercado;

import entidades.Categoria;

public class Principal {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        Produto p1 = new Produto("Coca-Cola", 4.5, Categoria.BEBIDAS, 10);
        Produto p2 = new Produto("Picanha", 79.9, Categoria.CARNES, 5);
        Produto p3 = new Produto("Maca", 2.0, Categoria.HORTIFRUTI, 20);
        Produto p4 = new Produto("Sabao em Po", 8.99, Categoria.LIMPEZA, 15);
        Produto p5 = new Produto("Pão Frances", 1.5, Categoria.PADARIA, 30);
        Produto p6 = new Produto("Alcatra", 49.9, Categoria.CARNES, 9);
        Produto p7 = new Produto("Figado", 29.9, Categoria.CARNES, 3);
        Produto p8 = new Produto("Guarana", 4.0, Categoria.BEBIDAS, 5);
        Produto p9 = new Produto("Agua", 2.0, Categoria.BEBIDAS, 15);
        
        System.out.println("Adionando 7 produtos");
        supermercado.adicionar(p1);
        supermercado.adicionar(p2);
        supermercado.adicionar(p3);
        supermercado.adicionar(p4);
        supermercado.adicionar(p5);
        supermercado.adicionar(p6);
        supermercado.adicionar(p7);
        supermercado.adicionar(p8);
        supermercado.adicionar(p9);
       
        System.out.println("\nListar Todos os Produtos");
        supermercado.listar();
        System.out.println("\nRemove o Primeiro Produto");
        supermercado.remover(p1);
        System.out.println("\nListar Todos os Produtos");
        supermercado.listar();
        
        System.out.println("\nListar apenas Bebidas");
        System.out.println(supermercado.listarPorCategoria(Categoria.BEBIDAS));            
        
        System.out.println("\nVenda do produto Picanha com a quantidade 2");
        supermercado.venderProduto(p2.getNome(), 2);
        
        System.out.println("\nListar apenas Carnes");
        System.out.println(supermercado.listarPorCategoria(Categoria.CARNES));
        
        System.out.println("\nRemoveu produto p4 e p5");
        supermercado.remover(p4);
        supermercado.remover(p5);
        
        System.out.println("\nLista final de Produtos: ");
        supermercado.listar();
        
    }
}
    