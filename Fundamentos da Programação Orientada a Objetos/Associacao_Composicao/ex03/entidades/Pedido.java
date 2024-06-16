package entidades;

public class Pedido {
    private String data;
    private float valorTotal;
    private Produto produto;

    public Pedido(String data, float valorTotal, Produto produto) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "data='" + data + '\'' +
                ", valorTotal=" + valorTotal +
                ", produto=" + produto.toString() +
                '}';
    }
}