package entidades;

public class LivroDidatico extends Livro {
    private String disciplina;
    private int anoEscolar;
    private String nivelEnsino;
    
    public LivroDidatico(String titulo, String autor, int anoPublicacao, String disciplina, int anoEscolar, String nivelEnsino) {
        super(titulo, autor, anoPublicacao);
        this.disciplina = disciplina;
        this.anoEscolar = anoEscolar;
        this.nivelEnsino = nivelEnsino;
    }
    
    @Override
    public void informarDetalhes() {
        super.informarDetalhes();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Ano Escolar: " + this.anoEscolar);
        System.out.println("Nível de Ensino: " + this.nivelEnsino);
    }
    
    public boolean verificarCompatibilidade(int anoEscolar, String nivelEnsino) {
        return this.anoEscolar == anoEscolar && this.nivelEnsino.equals(nivelEnsino);
    }
}