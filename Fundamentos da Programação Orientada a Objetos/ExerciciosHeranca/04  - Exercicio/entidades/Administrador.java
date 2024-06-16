package entidades;

public class Administrador extends Funcionario {
    private int horasExtras;
    
    public Administrador(String nome, String rg, float salario) {
        super(nome, rg, salario);
        this.horasExtras = 0;
    }
    
    public void acumularHorasExtras(int horas) {
        horasExtras =  horasExtras + horas;
    }
    
    public int getHorasExtras() {
        return horasExtras;
    }
    
    @Override
    public float calcularHolerite() {
        float salarioTotal = super.calcularHolerite();
        salarioTotal = salarioTotal+  (horasExtras * (getSalario() / 100));
        return salarioTotal;
    }
}

