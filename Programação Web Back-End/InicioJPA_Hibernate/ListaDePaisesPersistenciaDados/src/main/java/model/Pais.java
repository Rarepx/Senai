package model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pais")
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Essa anotação define a estratégia de geração automática
	// de valores para uma coluna de chave primária em um banco
	// de dados. O valor GenerationType.IDENTITY indica que os
	// valores são gerados automaticamente e incrementados em
	// um número inteiro

	@Column(name = "id_pais")
	private Integer id;
	@Column(name = "nome_pais")
	private String nome;
	@Column(name = "capital_pais")
	private String capital;

	public Pais() {
	}

	public Pais(String nome, String capital) {
		this.nome = nome;
		this.capital = capital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Integer getId() {
		return id;
	}

	// garante que a entidade pais possa ser localizada no cache corretamente.
	@Override
	public int hashCode() {
		return Objects.hash(capital, id, nome);
	}

	// usado para determinar se dois objetos (paises) são iguais
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pais [id= " + id + ", nome=" + nome + ", capital=" + capital + "]";
	}

}
