import Livro from "./Livro.js";
import Livraria from "./Livraria.js";

let livro1 = new Livro("Iracema", "123", "José de Alencar", 1);
let livro2 = new Livro("O Principe", "234", "Niccolò Machiavelli", 1);
let livro3 = new Livro("1984", "345", "George Orwell", 1);

let livraria = new Livraria();

livraria.adicionarLivro(livro1);
livraria.adicionarLivro(livro2);
livraria.adicionarLivro(livro3);

livraria.listarLivros();
livraria.removerLivro("234");
console.log("==========================");
livraria.listarLivros();