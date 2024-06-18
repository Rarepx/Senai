// Criação do módulo Angular
let app = angular.module('minhaAplicacao', []);

// Controller para manipular os dados
app.controller('meuController', function ($scope) {
  // Array de objetos representando livros
  $scope.livros = [
    { titulo: 'Iracema', autor: 'José de Alencar', ano: 1865 },
    { titulo: 'O Alienista', autor: 'Machado de Assis', ano: 1882 },
    { titulo: 'O Quinze', autor: 'Rachel de Queiroz', ano: 1930 },
  ];
});
