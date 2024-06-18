import Aluno from "./Aluno.js";

let aluno = new Aluno();
aluno.setNome = "Pedro da Silva";
aluno.setNumeroMatricula = "1234";

aluno.setProva1 = 5;
aluno.setProva2 = 6;
aluno.setNotaDeAtividade = 7;

console.log(aluno.calcularNotaFinal(1, 1, 0.1));
console.log(aluno.toString());