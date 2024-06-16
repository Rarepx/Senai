package entidades;

public class Vendedor extends Funcionario {
    private float vendas;
    
    public Vendedor(String nome, String rg, float salario, float vendas) {
        super(nome, rg, salario);
        this.vendas = vendas;
    }
    
    public void acumularVendas(float valor) {
        vendas = vendas + valor;
    }
    
    public float getVendas() {
        return vendas;
    }
    
    @Override
    public float calcularHolerite() {
    	float salarioTotal = super.calcularHolerite();
    	salarioTotal = (float) (salarioTotal + (vendas * 0.05));
        return salarioTotal;
    }
}