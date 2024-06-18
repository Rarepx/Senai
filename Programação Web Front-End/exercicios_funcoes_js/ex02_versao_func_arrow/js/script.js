// Aguarde até que o DOM esteja completamente carregado antes de executar o código.
document.addEventListener("DOMContentLoaded", () => {
    let raizRadio = document.getElementById("raizRadio");
    let exponencialRadio = document.getElementById("exponencialRadio");
    let calcularRaizBtn = document.getElementById("calcularRaizBtn");
    let calcularExponencialBtn = document.getElementById("calcularExponencialBtn");
    let resultado = document.getElementById("resultado");

    raizRadio.addEventListener("click", () => {
        document.getElementById("raizDiv").style.display = "block";
        document.getElementById("exponencialDiv").style.display = "none";
    });

    exponencialRadio.addEventListener("click", () => {
        document.getElementById("raizDiv").style.display = "none";
        document.getElementById("exponencialDiv").style.display = "block";
    });

    calcularRaizBtn.addEventListener("click", () => {
        let numero = parseFloat(document.getElementById("numeroRaiz").value);

        if (numero < 0) {
            exibirResultado("Erro: Não é possível calcular a raiz de um número negativo.");
        } else {
            let resultadoOperacao = Math.sqrt(numero);
            exibirResultado(resultadoOperacao);
        }
    });

    calcularExponencialBtn.addEventListener("click", () => {
        let base = parseFloat(document.getElementById("base").value);
        let expoente = parseFloat(document.getElementById("expoente").value);

        if ((!isNaN(base)) && (!isNaN(expoente))) {
            let resultadoOperacao = Math.pow(base, expoente);
            exibirResultado(resultadoOperacao);
        } else {
            exibirResultado("Erro: Valores de base ou expoente inválidos.");
        }
    });

    let exibirResultado = (resultadoOperacao) => {
        resultado.textContent = resultadoOperacao;
    };
});
