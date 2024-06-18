// Criação do módulo Angular
let app = angular.module('minhaAplicacao', []);

// Controller para manipular os dados
app.controller('meuController', function ($scope) {
  // Inicializa o array de produtos
  $scope.produtos = [];

  // Objeto para armazenar dados do novo produto a ser cadastrado
  $scope.novoProduto = {};

  // Função para adicionar um novo produto ao array
  $scope.adicionarProduto = function () {
    $scope.produtos.push({
      nome: $scope.novoProduto.nome,
      preco: $scope.novoProduto.preco,
      categoria: $scope.novoProduto.categoria,
    });

    // Limpa o formulário após o cadastro
    $scope.novoProduto = {};
  };

  // Função para filtrar produtos com base nos filtros aplicados
  $scope.filtrarProdutos = function () {
    $scope.produtosFiltrados = $scope.produtos.filter(function (produto) {
      return (!($scope.filtroNome) || produto.nome.toLowerCase().includes($scope.filtroNome.toLowerCase())) &&
             (!($scope.filtroCategoria) || produto.categoria.toLowerCase().includes($scope.filtroCategoria.toLowerCase()));
    });
  };
});
