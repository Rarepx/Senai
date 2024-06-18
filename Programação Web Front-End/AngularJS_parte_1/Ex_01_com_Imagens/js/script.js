let app = angular.module('minhaAplicacao', []);

app.controller('meuController', function ($scope) {
    $scope.frutas = ["Abacate", "Maçã", "Pera", "Laranja"];

    $scope.$watch('selecionaFruta', function (frutaSelecionada, frutaAnterior) {
        if (frutaSelecionada !== frutaAnterior) {
            $scope.exibeFruta = true;
            $scope.nomeFruta = frutaSelecionada;

            if (frutaSelecionada == "Abacate") {
                limpaCampoImagem();
                angular.element(document.getElementById('imagemFruta')).append('<img src="img/abacate.jpg" alt="Abacate" width="600" height="600">');
            }

            else if (frutaSelecionada == "Maçã") {
                limpaCampoImagem();
                angular.element(document.getElementById('imagemFruta')).append('<img src="img/maca.png" alt="Maçã" width="600" height="600">');
            }

            else if (frutaSelecionada == "Pera") {
                limpaCampoImagem();
                angular.element(document.getElementById('imagemFruta')).append('<img src="img/pera.jpg" alt="Pera" width="600" height="600">');
            }

            else if (frutaSelecionada == "Laranja") {
                limpaCampoImagem();
                angular.element(document.getElementById('imagemFruta')).append('<img src="img/laranja.jpg" alt="Laranja" width="600" height="600">');
            }
        }
    })

    function limpaCampoImagem() {
        document.getElementById('imagemFruta').innerText = '';
    }
})