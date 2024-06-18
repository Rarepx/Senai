export default class Produto {
    #nome;
    #codigo;
    #quantidadeEmEstoque;
    #dataValidade;
    
    constructor(nome, codigo, dataValidade, quantidadeEmEstoque) {
        this.#nome = nome;
        this.#codigo = codigo;
        this.#dataValidade = dataValidade;
        this.#quantidadeEmEstoque = quantidadeEmEstoque;
    }

    get getNome() {
        return this.#nome;
    }

    set setNome(nome) {
        this.#nome = nome;
    }

    get getCodigo() {
        return this.#codigo;
    }

    set setCodigo(codigo) {
        this.#codigo = codigo;
    }

    get getDataValidade() {
        return this.#dataValidade;
    }

    set setDataValidade(dataValidade) {
        this.#dataValidade = dataValidade;
    }

    get getQuantidadeEmEstoque() {
        return this.#quantidadeEmEstoque;
    }

    set setQuantidadeEmEstoque(quantidadeEmEstoque){
        this.#quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    exibirConteudo() {
        console.log(`Nome: ${this.#nome}`);
        console.log(`Código: ${this.#codigo}`);
        console.log(`Quantidade em Estoque: ${this.#quantidadeEmEstoque}`);
        console.log(`Data de Validade: ${this.#dataValidade}`);
    }
}


