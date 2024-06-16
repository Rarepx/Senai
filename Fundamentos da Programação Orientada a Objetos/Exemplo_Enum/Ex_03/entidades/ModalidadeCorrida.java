package entidades;

public enum ModalidadeCorrida {
    RUA("Consiste em corridas de longa distância em pistas de rua"),
    TRILHA("Corrida realizada em trilha de montanhas ou colinas"),
    REVEZAMENTO("Nesta modalidade uma equipe de atletas percorrem 100 ou 400 metros em revezamento.");

    private String descricao;

    ModalidadeCorrida(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}