export default class Endereco {
    #cidade;
    #bairro;
    #rua;
    #numero;
    #cep;
    #estado;
    #pais;

    constructor(cidade = "", bairro = "", rua = "", numero = "", cep = "", estado = "", pais = "") {
        this.#cidade = cidade;
        this.#bairro = bairro;
        this.#rua = rua;
        this.#numero = numero;
        this.#cep = cep;
        this.#estado = estado;
        this.#pais = pais;
    }

    // Métodos Getters e Setters 
    get getCidade() {
        return this.#cidade;
    }
    set setCidade(cidade) {
        this.#cidade = cidade;
    }

    get getBairro() {
        return this.#bairro;
    }
    set setBairro(bairro) {
        this.#bairro = bairro;
    }

    get getRua() {
        return this.#rua;
    }
    set setRua(rua) {
        this.#rua = rua;
    }

    get getNumero() {
        return this.#numero;
    }
    set setNumero(numero) {
        this.#numero = numero;
    }

    get getCep() {
        return this.#cep;
    }
    set setCep(cep) {
        this.#cep = cep;
    }

    get getEstado() {
        return this.#estado;
    }
    set setEstado(estado) {
        this.#estado = estado;
    }

    get getPais() {
        return this.#pais;
    }
    set setPais(pais) {
        this.#pais = pais;
    }

    // Método toString para exibir o endereço
    toString() {
        return `Endereço: 
        ${this.#cidade}, ${this.#estado}, ${this.#pais}, ${this.#bairro} \n
        ${this.#rua}, ${this.#numero}, ${this.#cep}`;
    }
}