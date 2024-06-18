var app = angular.module('minhaAplicacao', []);

app.controller('meuController', function ($scope, $http, $filter) {
    $scope.dataSelecionada = new Date(); // Inicializa com a data atual
    $scope.imageUrl = '';

    $scope.obterData = function () {
        let dataFormatada = $filter('date')($scope.dataSelecionada, 'yyyy-MM-dd');
        //A função $filter('date') é um serviço AngularJS que permite formatar 
        //valores de data e hora. O primeiro argumento é o nome do filtro, que é 'date' 
        //neste caso, e o segundo argumento é o valor que desejamos formatar esse é o formato 'yyyy-MM-dd'
        buscarImagem(dataFormatada)
            .then(function (data) {
                $scope.imageUrl = data.url;
            })
            .catch(function (error) {
                console.error("Ocorreu um erro na solicitação:", error);
            });
    };

    function buscarImagem(dataSelecionada) {
        const apiKey = 'ddutt5o1zbszvYRunHwVJtOpLP1a03ULcOBO3EFq';
        let url = `https://api.nasa.gov/planetary/apod?api_key=${apiKey}&date=${dataSelecionada}`;

        return $http.get(url)
            .then(function (response) {
                return response.data;
            })
            .catch(function (error) {
                console.error("Ocorreu um erro na solicitação HTTP", error);
            });
    }

    // Inicia com a imagem da data atual
    $scope.obterData();
});
