// Criação do módulo Angular chamado 'minhaAplicacao'
let app = angular.module('minhaAplicacao', []);

// Definição de um serviço factory chamado 'ListaTarefas'
app.factory('ListaTarefas', function () {
    // Variável local para armazenar a lista de tarefas
    let lista = [];

    // Função para adicionar uma nova tarefa à lista
    function adicionar(tarefa) {
        lista.push(tarefa);
    }

    // Função para remover uma tarefa da lista pelo índice
    function remover(indice) {
        lista.splice(indice, 1);
    }

    // Função para obter a lista completa de tarefas
    function listar() {
        return lista;
    }

    // Retorna um objeto contendo os métodos do serviço
    let metodosListaTarefas = {
        adicionar: adicionar,
        remover: remover,
        listar: listar
    };

    return {
        metodosListaTarefas: metodosListaTarefas
    };
    //O return está sendo utilizado para retornar um objeto literal a partir 
    //da factory ListaTarefas.
    //Esse objeto contém uma propriedade chamada metodosListaTarefas que está associada à variável ou função metodosListaTarefas.
});

// Controlador chamado 'listaTarefasController' que utiliza o serviço 'ListaTarefas'
app.controller('listaTarefasController', function ($scope, ListaTarefas) {
    // Variável de escopo para armazenar a nova tarefa a ser adicionada
    $scope.novaTarefa = '';

    // Variável de escopo que recebe a lista de tarefas do serviço
    $scope.listaTarefas = ListaTarefas.metodosListaTarefas.listar();

    // Função de escopo para adicionar uma nova tarefa à lista
    $scope.adicionarTarefa = function () {
        if ($scope.novaTarefa) {
            // Chama o método do serviço para adicionar a tarefa
            ListaTarefas.metodosListaTarefas.adicionar($scope.novaTarefa);
            // Limpa o campo de entrada
            $scope.novaTarefa = '';
            // Atualiza a lista de tarefas no escopo
            $scope.listaTarefas = ListaTarefas.metodosListaTarefas.listar();
        }
    };

    // Função de escopo para remover uma tarefa da lista pelo índice
    $scope.removerTarefa = function (indice) {
        // Chama o método do serviço para remover a tarefa
        ListaTarefas.metodosListaTarefas.remover(indice);
        // Atualiza a lista de tarefas no escopo
        $scope.listaTarefas = ListaTarefas.metodosListaTarefas.listar();
    };
});
