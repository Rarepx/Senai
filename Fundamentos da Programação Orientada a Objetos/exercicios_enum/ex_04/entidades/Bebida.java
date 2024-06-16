package entidades;

public class Bebida {
    
    private TipoBebida tipoBebida;
    private int quantidade;
    
    public Bebida(TipoBebida tipoBebida, int quantidade) {
        this.tipoBebida = tipoBebida;
        this.quantidade = quantidade;
    }
    
    public TipoBebida getTipoBebida() {
        return tipoBebida;
    }
    
    public void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
