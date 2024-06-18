import Aluno from "./Aluno.js";
import Alunos from "./Alunos.js";

// Criar alunos
let aluno1 = new Aluno("Ana", "12345");
let aluno2 = new Aluno("Carlos", "54321");
let aluno3 = new Aluno("Pedro", "98765");

// Adicionar notas aos alunos
aluno1.adicionarNota(8);
aluno1.adicionarNota(8);
aluno2.adicionarNota(5);
aluno2.adicionarNota(6);
aluno3.adicionarNota(4);
aluno3.adicionarNota(3);

// Criar uma lista de alunos
let listaAlunos = new Alunos();

// Adicionar alunos à lista
listaAlunos.adicionarAluno(aluno1);
listaAlunos.adicionarAluno(aluno2);
listaAlunos.adicionarAluno(aluno3);

// Listar notas dos alunos
let notasDosAlunos = listaAlunos.listarNotas();
console.log("Notas dos Alunos:");
console.log(notasDosAlunos);

// Encontrar um aluno por número de matrícula
let alunoEncontrado = listaAlunos.encontrarAlunoPorMatricula("98765");
console.log("\nAluno Encontrado:");
console.log(alunoEncontrado);

// Editar a nota de um aluno
let resultadoEdicao = listaAlunos.editarNota(0, 1, 7.5); // Editar a segunda nota do primeiro aluno
console.log("\nResultado da Edição:");
console.log(resultadoEdicao);

// Listar notas atualizadas dos alunos
let notasAtualizadas = listaAlunos.listarNotas();
console.log("\nNotas Atualizadas dos Alunos:");
console.log(notasAtualizadas);
