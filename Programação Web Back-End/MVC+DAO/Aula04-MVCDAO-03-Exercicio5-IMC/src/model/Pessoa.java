package model;

public class Pessoa {
    private String nome;
    private String sexo;
    private double altura;
    private int idade;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sexo, double altura, int idade, double peso) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
        
        calcularIMC();
    }

    // Getters e Setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return this.imc;
    }

    // Método para calcular o IMC
    private void calcularIMC() {
        // Calcula o IMC
        this.imc = this.peso / (this.altura * this.altura);
    }
}
