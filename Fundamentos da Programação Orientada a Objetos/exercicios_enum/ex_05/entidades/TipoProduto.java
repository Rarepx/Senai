package entidades;

public enum TipoProduto {
    FONES(50.0),
    NOTEBOOK(2000.0),
    IMPRESSORA(1500.0),
    MONITOR(800.0),
    MOUSE(30.0),
    TECLADO(40.0);

    private double preco;

    private TipoProduto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}