let app = angular.module('minhaAplicacao', []);

app.controller('filmesController', function ($scope) {
  $scope.filmes = [];
  $scope.novoFilme = {};
  $scope.filmesFiltrados = [];

  // Função para cadastrar um novo filme
  $scope.cadastrarFilme = function () {
    $scope.filmes.push({
      titulo: $scope.novoFilme.titulo,
      ano: $scope.novoFilme.ano,
      classificacao: $scope.novoFilme.classificacao
    });

    // Limpar o objeto de novo filme
    $scope.novoFilme = {};
  };

  // Função para aplicar a classificação
  $scope.aplicarClassificacao = function () {
    $scope.filmesFiltrados = $scope.filmes.filter(function (filme) {
      if (filme.classificacao > 16) {
        return true;
      } else {
        return false;
      }
    });

    // Ordenar os filmes por ano de lançamento
    $scope.filmesFiltrados.sort(function (filme_1, filme_2) {
      return filme_1.ano - filme_2.ano;
    });
  };
});
