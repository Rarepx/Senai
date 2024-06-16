package entidades;

public abstract class Item {
    protected int identificacao;
    protected String nome;
    protected float preco;
    protected float imposto;

    public Item(int id, String nome, float preco, float imposto) {
        this.identificacao = id;
        this.nome = nome;
        this.preco = preco;
        this.imposto = imposto;
    }

    public void exibirInformacoes() {
        System.out.println("Identificacao: " + identificacao);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Imposto: " + imposto*100 + "%");
    }

    public abstract float calcularPreco();
}
