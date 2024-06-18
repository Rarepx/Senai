// Criação do módulo Angular
let app = angular.module('minhaAplicacao', []);

// Controller para manipular os dados
app.controller('meuController', function ($scope) {
  // Array de objetos representando países
  $scope.paises = [
    { nome: 'Brasil', continente: 'América do Sul' },
    { nome: 'Japão', continente: 'Ásia' },
    { nome: 'Chile', continente: 'América do Sul' },
    { nome: 'Portugal', continente: 'Europa' },
    { nome: 'Estados Unidos', continente: 'América do Norte' },
    { nome: 'Bolivia', continente: 'América do Sul' },
    { nome: 'Canadá', continente: 'América do Norte' },
    { nome: 'China', continente: 'Ásia' },
    { nome: 'França', continente: 'Europa' },
    { nome: 'Argentina', continente: 'América do Sul' },
    { nome: 'Holanda', continente: 'Europa' },
    { nome: 'Coreia do Sul', continente: 'Ásia' },
    // Adicione mais países conforme necessário
  ];
});
