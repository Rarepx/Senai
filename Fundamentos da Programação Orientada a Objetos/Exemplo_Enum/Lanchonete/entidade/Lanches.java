package entidade;

public enum Lanches {
    SANDUICHE("Sanduiche", 18.00),
    HOTDOG("HotDog", 12.00),
    XBURGER("X-Burger", 16.50);
    
    private double preco;
    private String nome;
    
    private Lanches(String nome, double preco){
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
