let app = angular.module('minhaAplicacao', []);

app.factory('Calculadora', function () {
    let operacao = {};

    operacao.adicao = function (num1, num2) {
        return (num1 + num2);
    };

    operacao.subtracao = function (num1, num2) {
        return (num1 - num2);
    };

    operacao.multiplicacao = function (num1, num2) {
        return (num1 * num2);
    };

    operacao.divisao = function (num1, num2) {
        if (num2 !== 0) {
            return (num1 / num2);
        } else {
            return 'Divisão por zero';
        }
    };

    operacao.raizQuadrada = function (num) {
        return Math.sqrt(num);
    };

    operacao.exponencial = function (num) {
        return Math.exp(num);
    };

    return operacao;
});

app.controller('calculadoraController', function ($scope, Calculadora) {
    // Inicializa o modelo dos números e do resultado
    $scope.numero1 = '';
    $scope.numero2 = '';
    $scope.resultado = '';
    $scope.informacoesExibidas = false;
    $scope.desabilitarNum2 = false;

    // Função para calcular operações com base no tipo de operação passado
    $scope.calcular = function (operacao) {
        switch (operacao) {
            case '+':
                $scope.resultado = Calculadora.adicao($scope.numero1, $scope.numero2);
                $scope.informacoesExibidas = true;
                break;
            case '-':
                $scope.resultado = Calculadora.subtracao($scope.numero1, $scope.numero2);
                $scope.informacoesExibidas = true;
                break;
            case '*':
                $scope.resultado = Calculadora.multiplicacao($scope.numero1, $scope.numero2);
                $scope.informacoesExibidas = true;
                break;
            case '/':
                $scope.resultado = Calculadora.divisao($scope.numero1, $scope.numero2);
                $scope.informacoesExibidas = true;
                break;
            case 'sqrt':
                $scope.desabilitarNum2 = true;
                $scope.resultado = Calculadora.raizQuadrada($scope.numero1).toFixed(2);
                $scope.informacoesExibidas = true;
                break;
            case 'exp':
                $scope.desabilitarNum2 = true;
                $scope.resultado = Calculadora.exponencial($scope.numero1).toFixed(2);
                $scope.informacoesExibidas = true;
                break;
            default:
                $scope.resultado = 'Operação inválida';
        }
    };
});
