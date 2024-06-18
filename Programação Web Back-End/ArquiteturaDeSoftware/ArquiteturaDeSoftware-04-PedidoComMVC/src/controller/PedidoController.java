package controller;

import java.util.Date;
import model.Cliente;
import model.Pedido;
import model.Produto;
import view.PedidoView;

public class PedidoController {
    private PedidoView pedidoView;

    public PedidoController() {
        pedidoView = new PedidoView();
    }

    public Pedido criarPedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {
        Pedido pedido = new Pedido(idPedido, cliente, produto, quantidade, data);
        return pedido;
    }

    public void exibirDetalhesPedido(Pedido pedido) {
        pedidoView.exibirPedido(pedido);
    }
}
