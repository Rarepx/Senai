package entidades;

public class Automovel {
    private String marca;
    private float quilometragem;
    private Motor motor;
    private Pneu[] pneus;
    
    public Automovel(String marca, float quilometragem, Motor motor, Pneu[] pneus) {
        this.marca = marca;
        this.quilometragem = quilometragem;
        this.motor = motor;
        this.pneus = pneus;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public float getQuilometragem() {
        return quilometragem;
    }
    
    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public Pneu[] getPneus() {
        return pneus;
    }
    
    public void setPneus(Pneu[] pneus) {
        this.pneus = pneus;
    }
    
    @Override
    public String toString() {
        String informacoes = "Marca de Automóvel: " + marca + ", Km: " + quilometragem + "\n";
        informacoes = informacoes + motor.toString() + "\n";
        
        for (int i = 0; i < pneus.length; i++) {
        	informacoes = informacoes + pneus[i].toString() + "\n";
        }
        return informacoes;
    }
}
