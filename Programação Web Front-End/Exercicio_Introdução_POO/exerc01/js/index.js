import Aluno from "./Aluno.js";

let aluno1 = new Aluno("Carlos de Almeida", "123", 18);
console.log(aluno1.toString());

//outra forma de instânciar um objeto Aluno
let aluno2 = new Aluno(); 
aluno2.setNome = "Pedro da Silva";
aluno2.setNumeroMatricula = 1234;
aluno2.setIdade = 21;

console.log(aluno2.toString());