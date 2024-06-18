export default class Aluno {
    #nome;
    #numeroMatricula;
    #prova1;
    #prova2;
    #notaDeAtividade;

    // Getters and Setters
    get getNome() {
        return this.#nome;
    }
    set setNome(nome) {
        this.#nome = nome;
    }

    get getNumeroMatricula() {
        return this.#numeroMatricula;
    }
    set setNumeroMatricula(numeroMatricula) {
        this.#numeroMatricula = numeroMatricula;
    }

    get getProva1() {
        return this.#prova1;
    }
    set setProva1(prova1) {
        this.#prova1 = prova1;
    }

    get getProva2() {
        return this.#prova2;
    }
    set setProva2(prova2) {
        this.#prova2 = prova2;
    }

    get getNotaDeAtividade() {
        return this.#notaDeAtividade;
    }
    set setNotaDeAtividade(notaDeAtividade) {
        this.#notaDeAtividade = notaDeAtividade;
    }

    // Método para calcular a nota final com pesos diferentes
    calcularNotaFinal(pesoProva1, pesoProva2, pesoAtividade) {
        let totalPesos = (pesoProva1 + pesoProva2 + pesoAtividade);
        console.log(totalPesos);
        if (totalPesos > 10) {
            return "Erro: Os pesos devem somar 10";
        }
        // Calcula a nota final com base nos pesos
        let notaFinal = (((this.#prova1 * pesoProva1) + (this.#prova2 * pesoProva2) + (this.#notaDeAtividade * pesoAtividade))/2);
        return notaFinal.toFixed(2);
    }

    toString(){
        return `Aluno: 
        Nome: ${this.#nome} \n
        Numero de Matricula: ${this.#numeroMatricula} \n
        Prova 1: ${this.#prova1} \n
        Prova 2: ${this.#prova2} \n
        Nota de Atividade 2: ${this.#notaDeAtividade}`
    }
}
