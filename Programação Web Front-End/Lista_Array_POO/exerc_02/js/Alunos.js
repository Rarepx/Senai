export default class Alunos {
    #alunos;

    // Construtor da classe
    constructor() {
        // Inicializa a lista de alunos como um array vazio
        this.#alunos = [];
    }

    // Método para adicionar um aluno à lista
    adicionarAluno(aluno) {
        this.#alunos.push(aluno);
    }

    // Método para listar as notas de todos os alunos
    listarNotas() {
        let notas = [];
        this.#alunos.forEach(function (aluno, indice) {
            // Verifica se o aluno e o método getNotas existem para evitar erros
            if (aluno && aluno.getNotas) {
                // Adiciona as notas do aluno à lista de notas
                notas.push(`Aluno ${indice + 1}: ${aluno.getNotas().join(", ")}`);
            }
        });
        return notas;
    }

    // Método para encontrar um aluno por número de matrícula
    encontrarAlunoPorMatricula(numeroMatricula) {
        // Tenta encontrar o aluno na lista com base na matrícula
        let alunoEncontrado = this.#alunos.find(function(aluno) {
            // Compara a matrícula do aluno com o número de matrícula fornecido
            return aluno.getNumeroMatricula() === numeroMatricula;
        });
    
        // Se o aluno for encontrado, retorna uma representação em string do aluno
        if (alunoEncontrado) {
            return alunoEncontrado.toString();
        } 
        // Caso contrário, retorna uma mensagem indicando que o aluno não foi encontrado
        else {
            return "Aluno não encontrado";
        }
    }

    // Método para editar a nota de um aluno com base em índices
    editarNota(indiceAluno, indiceNota, novaNota) {
        // Atualiza a nota do aluno com base nos índices fornecidos
        this.#alunos[indiceAluno].getNotas()[indiceNota] = novaNota;
        return "Nota atualizada com sucesso";
    }
}
