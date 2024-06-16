package entidades;

public enum TipoDisciplina {
    FPOO("Fundamentos de Programação Orientada a Objetos"),
    REDES("Redes de Computadores"),
    SO("Sistemas Operacionais"),
    LM("Linguagem de Marcação");

    private String descricao;

    private TipoDisciplina(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
