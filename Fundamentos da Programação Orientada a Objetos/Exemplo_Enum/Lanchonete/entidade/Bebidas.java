package entidade;

public enum Bebidas {
    CAFE("Café", 2.00),
    REFRIGERANTE("Refrigerante", 3.50),
    SUCO("Suco", 1.50),
    AGUA("Água", 1.00);

    private double preco;
    private String nome;
    
    private Bebidas(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }
    
    public String getNome(){
        return this.nome;
    }
}
