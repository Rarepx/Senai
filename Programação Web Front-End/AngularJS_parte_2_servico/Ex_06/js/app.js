// Criação do módulo Angular chamado 'minhaAplicacao'
let app = angular.module('minhaAplicacao', []);

// Definição de um serviço service chamado 'ContatosService'
app.service('ContatosService', function () {
    // Variável local para armazenar a lista de contatos
    let listaContatos = [];

    // Função para adicionar um novo contato à lista
    this.adicionarContato = function (contato) {
        listaContatos.push(contato);
    };

    // Função para remover um contato da lista pelo índice
    this.removerContato = function (indice) {
        listaContatos.splice(indice, 1);
    };

    // Função para obter a lista completa de contatos
    this.listarContatos = function () {
        return listaContatos;
    };
});

// Controlador chamado 'contatosController' que utiliza o serviço 'ContatosService'
app.controller('contatosController', function ($scope, ContatosService) {
    // Variável de escopo para armazenar o novo contato a ser adicionado
    $scope.novoContato = {};

    // Variável de escopo que recebe a lista de contatos do serviço
    $scope.listaContatos = ContatosService.listarContatos();

    // Função de escopo para adicionar um novo contato à lista
    $scope.adicionarContato = function () {
        if ($scope.novoContato.nome && $scope.novoContato.telefone) {
            // Chama o método do serviço para adicionar o contato
            ContatosService.adicionarContato($scope.novoContato);
            // Limpa os campos de entrada
            $scope.novoContato = {};
            // Atualiza a lista de contatos no escopo
            $scope.listaContatos = ContatosService.listarContatos();
        }
    };

    // Função de escopo para remover um contato da lista pelo índice
    $scope.removerContato = function (index) {
        // Chama o método do serviço para remover o contato
        ContatosService.removerContato(index);
        // Atualiza a lista de contatos no escopo
        $scope.listaContatos = ContatosService.listarContatos();
    };
});
