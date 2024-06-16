package entidades;

public enum TipoLivro {
    ROMANCE("romance"),
    FICCAO_CIENTIFICA("ficção científica"),
    AVENTURA("aventura"),
    TUTORIAL("tútorial cientifico");
	
    private String descricao;

    private TipoLivro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
	
}
