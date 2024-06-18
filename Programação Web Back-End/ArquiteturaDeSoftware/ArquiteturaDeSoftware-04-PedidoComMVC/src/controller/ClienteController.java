package controller;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
    private ClienteView clienteView;

    public ClienteController() {
        clienteView = new ClienteView();
    }

    public Cliente criarCliente(int idCliente, String nome, String email) {
        Cliente cliente = new Cliente(idCliente, nome, email);
        return cliente;
    }

    public void exibirDetalhesCliente(Cliente cliente) {
        clienteView.exibirCliente(cliente);
    }
}
