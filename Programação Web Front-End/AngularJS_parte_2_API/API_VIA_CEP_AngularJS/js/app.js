// Criação de um módulo Angular chamado 'minhaAplicacao'
let app = angular.module('minhaAplicacao', []);

// Definição de um controller chamado 'meuController' dentro do módulo 'minhaAplicacao'
app.controller('meuController', function ($scope, $http) {
    // Inicialização do objeto 'endereco' no escopo, que armazenará informações de endereço
    $scope.endereco = {
        rua: "",
        bairro: "",
        cidade: "",
        uf: ""
    };

    // Função para limpar os campos do formulário de endereço
    $scope.limparCampos = function () {
        $scope.endereco.cep = "";
        $scope.endereco = {
            rua: "",
            bairro: "",
            cidade: "",
            uf: ""
        };
    };

    // Função que chama a função 'limparCampos' para limpar o formulário de endereço
    $scope.limpa_formulário_cep = function () {
        $scope.limparCampos();
    };

    // Função para processar a resposta obtida ao consultar o CEP
    $scope.processarRespostaCEP = function (conteudo) {
        // Verifica se a propriedade 'erro' está presente no conteúdo da resposta
        if ("erro" in conteudo) {
            // Se houver erro, limpa o formulário e exibe uma mensagem de alerta
            $scope.limpa_formulário_cep();
            alert("CEP não encontrado.");
        } else {
            // Se não houver erro, preenche o objeto 'endereco' com os dados obtidos
            $scope.endereco.cep = conteudo.cep;
            $scope.endereco.rua = conteudo.logradouro;
            $scope.endereco.bairro = conteudo.bairro;
            $scope.endereco.cidade = conteudo.localidade;
            $scope.endereco.uf = conteudo.uf;
        }
    };

    // Função para realizar a consulta do CEP
    $scope.pesquisacep = function (cep) {
        // Remove caracteres não numéricos do CEP
        cep = cep.replace(/\D/g, '');

        // Verifica se o CEP possui um formato válido
        if ((cep != "") && (/^[0-9]{8}$/.test(cep))) {
            // Limpa o formulário antes de realizar a consulta
            $scope.limpa_formulário_cep();

            // Realiza uma requisição HTTP GET para obter informações do CEP usando a API ViaCEP
            $http({
                method: 'GET',
                url: 'https://viacep.com.br/ws/' + cep + '/json/',
                headers: { 'Accept': 'application/json' }
                //informando explicitamente ao servidor que prefere receber a resposta no formato JSON.
            })
            // Promessa de sucesso ao obter a resposta da requisição
            .then(function (response) {
                // Chama a função para processar a resposta do CEP
                $scope.processarRespostaCEP(response.data);
            })
            // Captura de erro na requisição
            .catch(function (error) {
                // Registra o erro no console
                console.error("Erro ao consultar o CEP:", error);
                // Limpa o formulário e exibe uma mensagem de alerta
                $scope.limpa_formulário_cep();
                alert("Erro ao consultar o CEP. Verifique o console para mais informações.");
            });
        } else {
            // Se o CEP não possui um formato válido, limpa o formulário e exibe uma mensagem de alerta
            $scope.limpa_formulário_cep();
            alert("Formato de CEP inválido.");
        }
    };

    // Função para acionar a consulta do CEP ao clicar no botão "Verificar"
    $scope.verificarCep = function () {
        // Chama a função de consulta do CEP passando o CEP fornecido no input
        $scope.pesquisacep($scope.endereco.cep);
    };
});