package entidades;

public class Motor {
    private float quantidadeCombustivel;
    private int potencia;
    
    public Motor(float quantidadeCombustivel, int potencia) {
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.potencia = potencia;
    }
    
    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
    
    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public String toString() {
        return "Motor: quantidade de combustível: " + quantidadeCombustivel + " e potência: " + potencia + "hp";
    }
}
