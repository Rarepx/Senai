package entidades;

public class Pneu {
	    private String marca;
	    private float pressao;
	    
	    public Pneu(String marca, float pressao) {
	        this.marca = marca;
	        this.pressao = pressao;
	    }
	    
	    public String getMarca() {
	        return marca;
	    }
	    
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    
	    public float getPressao() {
	        return pressao;
	    }
	    
	    public void setPressao(float pressao) {
	        this.pressao = pressao;
	    }
	    
	    @Override
	    public String toString() {
	        return "Pneu marca: " + marca + ", pressão: " + pressao + " libras";
	    }
}
