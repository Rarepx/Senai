let app = angular.module('minhaAplicacao', []);

app.controller('meuController', function ($scope, $timeout) {
    // Inicializa o modelo da mensagem
    $scope.mensagem = 'Bem-vindo!';
    // Inicializa a variável para controlar a exibição da mensagem
    $scope.exibirMensagem = false;

    // Utiliza o serviço $timeout para exibir a mensagem após 3 segundos
    $timeout(function () {
        $scope.exibirMensagem = true;
    }, 3000);
});
