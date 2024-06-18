var app = angular.module('minhaAplicacao', []);

app.controller('meuController', function ($scope, $http) {
    $scope.racas = [];
    $scope.racaSelecionada = '';
    $scope.imagens = [];

    $scope.carregaRacas = function () {
        const url = 'https://api.thecatapi.com/v1/breeds';

        $http.get(url)
            .then(function (response) {
                $scope.racas = response.data;
                $scope.racaSelecionada = $scope.racas[0].id;
                $scope.obterImagensGato();
            })
            .catch(function (error) {
                console.error('Erro ao carregar raças de gato.', error);
            });
    };

    $scope.obterImagensGato = function () {
        if ($scope.racaSelecionada) {
            let url = `https://api.thecatapi.com/v1/images/search?breed_ids=${$scope.racaSelecionada}&limit=3`;

            $http.get(url)
                .then(function (imagens) {
                    $scope.imagens = imagens.data;
                })
                .catch(function (error) {
                    console.error('Erro ao carregar imagens de gato.', error);
                });
        } else {
            $scope.imagens = [];
        }
    };

    $scope.carregaRacas();
});