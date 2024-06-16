package entidades;

public class LivroDeFiccao extends Livro {

    private String genero;
    private String subgenero;

    public LivroDeFiccao(String titulo, String autor, int numPaginas, String genero, String subgenero) {
        super(titulo, autor, numPaginas);
        this.genero = genero;
        this.subgenero = subgenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public void sinopseDoLivro() {
        System.out.println("Sinopse do livro " + getTitulo() + ":");
    }

    @Override
    public void informarDetalhes() {
        super.informarDetalhes();
        System.out.println("Gênero: " + genero);
        System.out.println("Subgênero: " + subgenero);
    }
}