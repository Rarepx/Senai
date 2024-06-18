let app = angular.module('minhaAplicacao', []);

app.controller('meuController', function ($scope, $http) {
    // Inicializa o modelo das cidades
    $scope.cidades = [];

    // Utiliza o serviço $http para buscar os dados das cidades de SP na API do IBGE
    $http.get('https://servicodados.ibge.gov.br/api/v1/localidades/estados/SP/distritos')
        .then(function (response) {
            // Sucesso na resposta
            $scope.cidades = response.data;
        })
        .catch(function (error) {
            // Tratamento de erro
            console.error('Erro na solicitação:', error);
        });
});
