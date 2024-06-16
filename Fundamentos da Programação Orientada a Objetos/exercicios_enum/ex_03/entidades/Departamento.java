package entidades;

public enum Departamento {
    VENDAS("Vendas", "VD"),
    FINANCEIRO("Financeiro", "FN"),
    RH("Recursos Humanos", "RH"),
    TECNOLOGIA("Tecnologia", "TI");

    private final String nome;
    private final String codigo;

    Departamento(String nome, String codigo) {
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
