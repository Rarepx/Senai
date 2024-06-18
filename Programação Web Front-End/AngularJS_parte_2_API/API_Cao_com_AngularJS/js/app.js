let app = angular.module('minhaAplicacao', []);

// Criação de um controller chamado 'meuController' que utiliza o serviço $http
app.controller('meuController', function ($scope, $http) {
  $scope.cao = {
    racas: [],
    racaSelecionada: '',
    imagemSelecionada: ''
  };

  $scope.carregarRacas = function () {
    let url = 'https://dog.ceo/api/breeds/list/all';

    $http.get(url)
      .then(function (response) {
        let dado = response.data;
        $scope.cao.racas = Object.keys(dado.message);
        $scope.cao.racaSelecionada = $scope.cao.racas[0];
        $scope.carregarImagem();
      })
      .catch(function (error) {
        console.error('Erro ao carregar raças de cachorro.', error);
      });
  };

  $scope.carregarImagem = function () {
    if ($scope.cao.racaSelecionada) {
      let url = `https://dog.ceo/api/breed/${$scope.cao.racaSelecionada}/images/random`;

      $http.get(url)
        .then(function (response) {
          let dado = response.data;
          $scope.cao.imagemSelecionada = dado.message;
        })
        .catch(function (error) {
          console.error('Erro ao carregar imagem de cachorro.', error);
        });
    }
  };

  // Inicia o carregamento das raças
  // é executada imediatamente após o controller ser inicializado.
  $scope.carregarRacas();
});
