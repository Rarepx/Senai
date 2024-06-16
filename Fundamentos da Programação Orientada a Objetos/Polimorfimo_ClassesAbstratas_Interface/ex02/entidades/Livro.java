package entidades;


public class Livro extends Item {
    private int numPaginas;
    private int anoPublicacao;
    private String autor;
    private String tema;
    private String editora;
    

    public Livro(int id, String nome, float preco, float imposto, String autor, String tema, String editora, int numPaginas, int anoPublicacao) {
        super(id, nome, preco, imposto);
        this.numPaginas = numPaginas;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.tema = tema;
        this.editora = editora;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + autor);
        System.out.println("Tema: " + tema);
        System.out.println("Editora: " + editora);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }

    //valor do imposto e mais 2% do valor do livro
    @Override
    public float calcularPreco() {
    	float resultado;
    	
    	resultado = (preco + (preco*imposto) + (preco*0.02f));
        return resultado;
    }
}
