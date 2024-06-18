export default class Aluno{
    #nome;
    #numeroMatricula;
    #notas;

    constructor(nome="", numeroMatricula="") {
        this.#nome = nome;
        this.#numeroMatricula = numeroMatricula;
        this.#notas = [];
    }

    set setNome(nome){
        this.#nome = nome;
    }
    get getNumeroMatricula(){
        return this.#numeroMatricula;
    }
    set setNumeroMatricula(numeroMatricula){
        this.#numeroMatricula = numeroMatricula;
    }
    get getNome(){
        return this.#nome;
    }

    get getNotas() {
        return this.#notas;
    }

    adicionarNota(nota) {
        this.#notas.push(nota);
    }

    calcularMedia() {
        if (this.#notas.length === 0) {
            return 0;
        }

        let soma = this.#notas.reduce(function(acumulador, nota) { 
            return (acumulador + nota);
        }, 0);

        let media = (soma / this.#notas.length);
        return media;
    }

    toString(){
        return `Aluno: \n Nome: ${this.#nome}, \n Número de Matricula: ${this.#numeroMatricula}`;
    }
}