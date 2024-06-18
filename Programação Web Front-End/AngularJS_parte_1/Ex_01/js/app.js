// Criação do módulo Angular chamado 'minhaAplicacao'
let app = angular.module('minhaAplicacao', []);

// Criação do controlador 'meuController' dentro do módulo
app.controller('meuController', function($scope) {
  // Inicializa a variável 'frutaEscolhida' no escopo como vazia
  $scope.frutaEscolhida = '';
});
