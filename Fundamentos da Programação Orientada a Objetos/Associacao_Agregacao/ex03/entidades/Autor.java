package entidades;

public class Autor {
    private String nome;
    private int idade;
    private String lugar;

    public Autor(String nome, int idade, String lugar) {
        this.nome = nome;
        this.idade = idade;
        this.lugar = lugar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "\nAutor: " +
                "Nome: '" + nome + '\'' +
                ", Idade: " + idade +
                ", Lugar: '" + lugar + '\'' +
                "";
    }
}
