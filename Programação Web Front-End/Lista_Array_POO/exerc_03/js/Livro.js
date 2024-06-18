export default class Livro {
    #nome;
    #codigo;
    #autor;
    #quantidadeEstoque;

    constructor(nome="", codigo="", autor="", quantidadeEstoque=0) {
        this.#nome = nome;
        this.#codigo = codigo;
        this.#autor = autor;
        this.#quantidadeEstoque = quantidadeEstoque;
    }

    get getNome() {
        return this.#nome;
    }

    get getCodigo() {
        return this.#codigo;
    }

    get getAutor() {
        return this.#autor;
    }

    get getQuantidadeEstoque() {
        return this.#quantidadeEstoque;
    }

    exibirLivro() {
        console.log(`Nome: ${this.#nome}` + ` Código: ${this.#codigo}`);
        console.log(`Autor: ${this.#autor}` + ` Quantidade em Estoque: ${this.#quantidadeEstoque}`);
    }
}