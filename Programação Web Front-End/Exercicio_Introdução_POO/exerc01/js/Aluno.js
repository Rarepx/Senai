//Classe Aluno
export default class Aluno{
    #nome;
    #numeroMatricula;
    #idade;

    //Construtor para aceitar diferentes tipos de criação do objeto Aluno
    // essa proposta de construtor permite a instancie um objeto Aluno com todos, alguns ou nenhum dos parâmetros. 
    constructor(nome="", numeroMatricula="", idade=0){
        this.#nome = nome;
        this.#numeroMatricula = numeroMatricula;
        this.#idade = idade;
    }

   //Getters and Setters 
    set setNome(nome){
        this.#nome = nome;
    }
    get getNome(){
        return this.#nome;
    }

    set setNumeroMatricula(numeroMatricula){
        this.#numeroMatricula = numeroMatricula;
    }
    get getNumeroMatricula(){
        return this.#numeroMatricula;
    }

    set setIdade(idade){
        this.#idade = idade;
    }
    get getIdade(){
        return this.#idade;
    }

    //método toString() - veja foram adicionados \n para quebra de linha
    toString(){
        return `Aluno: Nome: ${this.#nome} \n
        Número de Matrícula: ${this.#numeroMatricula} \n
        Idade: ${this.#idade}`; 
    }
}