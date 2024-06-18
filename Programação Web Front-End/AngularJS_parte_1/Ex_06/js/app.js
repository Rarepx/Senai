let app = angular.module('minhaAplicacao', []);

app.controller('meuController', function ($scope) {
  $scope.alunos = [];
  $scope.novoAluno = {};
  $scope.mostrarAlunosAprovados = false;
  $scope.mostrarAlunosReprovados = false;

  $scope.adicionarAluno = function () {
    $scope.alunos.push({
      nome: $scope.novoAluno.nome,
      nota1: $scope.novoAluno.nota1,
      nota2: $scope.novoAluno.nota2,
      nota3: $scope.novoAluno.nota3,
    });

    $scope.novoAluno = {};
  };

  $scope.calcularMediaIndividual = function (aluno) {
    return ((aluno.nota1 + aluno.nota2 + aluno.nota3) / 3).toFixed(2);
  };

  $scope.calcularMediasAlunos = function () {
    $scope.mostrarAlunosAprovados = true;
    $scope.mostrarAlunosReprovados = true;
  };

  $scope.alunosAprovados = function () {
    return $scope.alunos.filter(function (aluno) {
      return $scope.calcularMediaIndividual(aluno) >= 5;
    });
  };

  $scope.alunosReprovados = function () {
    return $scope.alunos.filter(function (aluno) {
      return $scope.calcularMediaIndividual(aluno) < 5;
    });
  };
});
