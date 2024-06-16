package entidades;

public class Eletronico extends Item {
    private String tensao;
     	
    public Eletronico(int id, String nome, float  preco, float imposto, String tensao) {
        super(id, nome, preco, imposto);
        this.tensao = tensao;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tensao: " + tensao);
    }
    
    //valor do imposto e mais 8% do valor eletrônico
    @Override
    public float calcularPreco() {
    	float resultado;
    	resultado = (preco + (preco*imposto) + (preco*0.08f));
    	
        return resultado; 
    }
}
