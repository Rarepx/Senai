export default class Livraria {
    #livros;

    constructor() {
        this.#livros = [];
    }

    adicionarLivro(livro) {
        this.#livros.push(livro);
    }

   
   removerLivro(codigo) {
    // Utilizamos o método filter() para criar um novo array 
    //que exclui o livro com o código especificado
    this.#livros = this.#livros.filter(function(livro){
        return (livro.getCodigo !== codigo);
    }); 
    // Exibimos uma mensagem informando que o livro foi removido
    console.log(`Livro com código ${codigo} removido.`);
}

listarLivros() {
    console.log("Livros disponíveis na livraria:");
    
    // Iteramos sobre o array #livros e exibimos informações sobre cada livro
    this.#livros.forEach(function(livro, indice) {
        console.log(`Livro ${indice + 1}:`);
        livro.exibirLivro();
    });
}
}