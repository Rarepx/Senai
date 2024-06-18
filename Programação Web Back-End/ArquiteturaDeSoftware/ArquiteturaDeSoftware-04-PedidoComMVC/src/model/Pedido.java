package model;

import java.util.Date;

public class Pedido {
	private int idPedido;
	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	private Date data;

	public Pedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {
		this.criarPedido(idPedido, cliente, produto, quantidade, data);
	}

	public int getIdPedido() {
		return idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void criarPedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cliente=" + cliente + ", produto=" + produto + ", quantidade="
				+ quantidade + ", data=" + data + "]";
	}
}
