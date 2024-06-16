package entidades;

public enum Categoria {
    BEBIDAS("Bebidas", "BEB"),
    CARNES("Carnes", "CAR"),
    HORTIFRUTI("Hortifruti", "HOR"),
    LIMPEZA("Limpeza", "LIM"),
    PADARIA("Padaria", "PAD");

    private String nome;
    private String codigo;

    private Categoria(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
