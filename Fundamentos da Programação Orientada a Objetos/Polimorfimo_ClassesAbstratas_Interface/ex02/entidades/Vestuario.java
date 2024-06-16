package entidades;

public class Vestuario extends Item {
    private String descricao;
    private String tamanho;

    public Vestuario(int id, String nome, float preco, float imposto, String descricao, String tamanho) {
        super(id, nome, preco, imposto);
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Descricao: " + descricao);
        System.out.println("Tamanho: " + tamanho);
    }
	
    //o valor do imposto e mais 7% do valor vestuário.
    @Override
    public float calcularPreco() {
    	float resultado;
    	resultado = (preco + (preco*imposto) + (preco*0.07f));
        
    	return resultado; 
    }
}
