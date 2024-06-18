// Criação do módulo Angular chamado 'minhaAplicacao'
let app = angular.module('minhaAplicacao', []);

// Criação de um controlador dentro do módulo
app.controller('meuController', function($scope) {
  // Definição de uma variável no escopo ($scope) chamada 'numeros'
  // que recebe o resultado da função 'criarArrayDeUmAVinte()'
  $scope.numeros = criarArrayDeUmAVinte();
});

// Criação de um filtro chamado 'par' dentro do módulo
app.filter('par', function() {
  // Retorno de uma função que recebe uma entrada e retorna apenas os números pares
  return function(entrada) {
    let pares = [];
    for (let i = 0; i < entrada.length; i++) {
      let resto = (entrada[i] % 2);
      if (resto === 0) {
        pares.push(entrada[i]);
      }
    }
    return pares;
  };
});

// Definição de uma função chamada 'criarArrayDeUmAVinte'
// que cria e retorna um array de números de 1 a 20
function criarArrayDeUmAVinte() {
  let numeros = [];
  for (let i = 1; i <= 20; i++) {
    numeros.push(i);
  }
  return numeros;
}
