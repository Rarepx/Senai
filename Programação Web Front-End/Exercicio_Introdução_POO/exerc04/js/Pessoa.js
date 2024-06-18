export default class Pessoa {
    #nome;
    #idade;
    #cpf;
    #endereco;

    constructor(nome= "", idade= 0, cpf= "", novoEndereco= "") {
        this.#nome = nome;
        this.#idade = idade;
        this.#cpf = cpf;
        this.#endereco = novoEndereco;
    }

    // Métodos getters e setters 
    get getNome() {
        return this.#nome;
    }
    set setNome(nome) {
        this.#nome = nome;
    }

    get getIdade() {
        return this.#idade;
    }
    set setIdade(idade) {
        this.#idade = idade;
    }

    get getCpf() {
        return this.#cpf;
    }
    set setCpf(cpf) {
        this.#cpf = cpf;
    }

    get getEndereco() {
        return this.#endereco;
    }
    set setEndereco(endereco) {
        this.#endereco = endereco;
    }

    // Método toString para exibir a pessoa
    toString() {
        return `Pessoa: ${this.#nome}, Idade: ${this.#idade}, CPF: ${this.#cpf}, \n ${this.#endereco.toString()}`;
    }
}