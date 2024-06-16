package entidades;

public class Disciplina {
    private String periodo;
    private TipoDisciplina tipo;

    // Construtor
    public Disciplina(String periodo, TipoDisciplina tipo) {
        this.periodo = periodo;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String Periodo) {
        this.periodo = periodo;
    }

    public TipoDisciplina getTipo() {
        return tipo;
    }

    public void setTipo(TipoDisciplina tipo) {
        this.tipo = tipo;
    }
}
