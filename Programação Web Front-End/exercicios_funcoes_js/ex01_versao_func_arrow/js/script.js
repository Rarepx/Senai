// Aguarde até que o DOM esteja completamente carregado antes de executar o código.
document.addEventListener("DOMContentLoaded", () => {
    let numero1Input = document.getElementById("numero1");
    let numero2Input = document.getElementById("numero2");
    let resultado = document.getElementById("resultado");

    // Função para calcular a operação matemática com base na operação especificada.
    let calcular = (operacao) => {
        let numero1 = parseFloat(numero1Input.value);
        let numero2 = parseFloat(numero2Input.value);
        let resultadoOperacao = 0;

        // Realize a operação com base na escolha do usuário.
        switch (operacao) {
            case "adicao":
                resultadoOperacao = (numero1 + numero2);
                break;
            case "subtracao":
                resultadoOperacao = (numero1 - numero2);
                break;
            case "multiplicacao":
                resultadoOperacao = (numero1 * numero2);
                break;
            case "divisao":
                if (numero2 === 0) {
                    resultadoOperacao = "Erro: Divisão por zero não é permitida!";
                } else {
                    resultadoOperacao = (numero1 / numero2);
                }
                break;
            default:
                resultadoOperacao = "Operação inválida.";
        }

        exibirResultado(resultadoOperacao);
    };

    // Função para exibir o resultado no elemento de resultado.
    let exibirResultado = (resultadoOperacao) => {
        resultado.textContent = resultadoOperacao;
    };

    // Adicione ouvintes de eventos de clique aos botões de operação.
    document.getElementById("adicao").addEventListener("click", () => calcular("adicao"));
    document.getElementById("subtracao").addEventListener("click", () => calcular("subtracao"));
    document.getElementById("multiplicacao").addEventListener("click", () => calcular("multiplicacao"));
    document.getElementById("divisao").addEventListener("click", () => calcular("divisao"));
});

