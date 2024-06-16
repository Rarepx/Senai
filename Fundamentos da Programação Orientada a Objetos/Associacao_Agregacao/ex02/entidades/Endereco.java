package entidades;

public class Endereco {
	 private String cidade;
	 private String bairro;
	 private String nomeRua;
	 private int numeroCasa;
	 private int cep;
	 private String estado;
	 private String pais;
	    
	    public Endereco(String cidade, String bairro, String nomeRua, int numeroCasa, int cep, String estado, String pais) {
	        this.cidade = cidade;
	        this.bairro = bairro;
	        this.nomeRua = nomeRua;
	        this.numeroCasa = numeroCasa;
	        this.cep = cep;
	        this.estado = estado;
	        this.pais = pais;
	    }

	    public String getCidade() {
	        return cidade;
	    }

	    public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }

	    public String getBairro() {
	        return bairro;
	    }

	    public void setBairro(String bairro) {
	        this.bairro = bairro;
	    }

	    public String getNomeRua() {
	        return nomeRua;
	    }

	    public void setNomeRua(String nomeRua) {
	        this.nomeRua = nomeRua;
	    }

	    public int getNumeroCasa() {
	        return numeroCasa;
	    }

	    public void setNumeroCasa(int numeroCasa) {
	        this.numeroCasa = numeroCasa;
	    }

	    public int getCep() {
	        return cep;
	    }

	    public void setCep(int cep) {
	        this.cep = cep;
	    }

	    public String getEstado() {
	        return estado;
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }

	    public String getPais() {
	        return pais;
	    }

	    public void setPais(String pais) {
	        this.pais = pais;
	    }

	    @Override
	    public String toString() {
	        return "Endereco{" +
	                "Cidade: '" + cidade + '\'' +
	                ", Bairro:'" + bairro + '\'' +
	                ", Nome da Rua: '" + nomeRua + '\'' +
	                ", Numero da Casa: " + numeroCasa +
	                ", CEP: " + cep +
	                ", Estado: '" + estado + '\'' +
	                ", Pais: '" + pais + '\'' +
	                '}';
	    }
	}
