package entidades;

public enum TipoBebida {
    REFRIGERANTE(4.50),
    SUCO(5.50),
    CHA(3.00);
    
    private double preco;
    
    private TipoBebida(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
}
