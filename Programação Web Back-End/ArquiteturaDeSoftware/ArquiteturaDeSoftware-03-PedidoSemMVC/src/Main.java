import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto cliente
        Cliente cliente = new Cliente(1, "João", "joao@email.com");
        
        // Cria um objeto produto
        Produto produto = new Produto(101, "Celular", 999.99);
        
        // Cria um objeto data
        Date data = new Date();

        // Cria um objeto pedido
        Pedido pedido = new Pedido(1, cliente, produto, 1, data);
        
        // Exibir dados do pedido
        pedido.exibirPedido(pedido);
    }
}
