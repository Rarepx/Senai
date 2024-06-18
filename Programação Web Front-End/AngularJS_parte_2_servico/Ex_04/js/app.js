let app = angular.module('minhaAplicacao', []);

app.service('conversorMoeda', function () {
    this.converterMoeda = function (valor, opcaoMoeda) {
        // Verifica se o valor informado é válido
        if (!valor || isNaN(valor)) {
            return alert('Por favor, insira um valor válido.');
        }

        // Converte para dólar
        if (opcaoMoeda === 'Real - Dólar') {
            var taxaDolar = 4.94;
            return (valor / taxaDolar).toFixed(2);
        }
        // Converte para euro
        else if (opcaoMoeda === 'Real - Euro') {
            var taxaEuro = 5.39;
            return (valor / taxaEuro).toFixed(2);
        } else {
            return alert('Opção de moeda inválida.');
        }
    };
});

app.controller('conversorController', function ($scope, conversorMoeda) {
    // Inicializa o modelo do valor, da opção de moeda e do resultado
    $scope.valor = '';
    $scope.opcaoMoeda = 'Real - Dólar';
    $scope.resultado = '';

    $scope.converterMoeda = function () {
        $scope.resultado = conversorMoeda.converterMoeda($scope.valor, $scope.opcaoMoeda);
    };
});
