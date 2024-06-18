import java.util.Date;

import controller.ClienteController;
import controller.PedidoController;
import controller.ProdutoController;
import model.Cliente;
import model.Pedido;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto ClienteController
    	ClienteController clienteController = new ClienteController();
    	
    	// Cria um objeto Cliente usando o método criarCliente do clienteController
        Cliente cliente = clienteController.criarCliente(1, "João", "joao@email.com");
        
        // Exibe os detalhes do cliente usando o clienteController
        clienteController.exibirDetalhesCliente(cliente);
        
        // Produto
        ProdutoController produtoController = new ProdutoController();
        Produto produto = produtoController.criarProduto(101, "Celular", 999.99);
        produtoController.exibirDetalhesProduto(produto);
        
        
        
        // Cria um objeto data
        Date data = new Date();

        
        
        // Cria um objeto pedidoController
        PedidoController pedidoController = new PedidoController();
        
        // Cria um objeto pedido usando controller
        Pedido pedido = pedidoController.criarPedido(1, cliente, produto, 1, data);
        
        // Exibe os detalhes do pedido
        pedidoController.exibirDetalhesPedido(pedido);
    }
}
