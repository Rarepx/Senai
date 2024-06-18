// Aguarde até que o DOM esteja completamente carregado antes de executar o código.
document.addEventListener("DOMContentLoaded", () => {
    let numeroInput = document.getElementById("numeroInput");
    let inverterBtn = document.getElementById("inverterBtn");
    let resultado = document.getElementById("resultado");

    inverterBtn.addEventListener("click", () => {
        let numero = numeroInput.value;

        // Converte o número para string, inverte seus caracteres e converte de volta para número.
        let numeroInvertido = +(numero.toString().split("").reverse().join(""));

        exibirResultado(numeroInvertido);
    });

    let exibirResultado = (numeroInvertido) => {
        resultado.textContent = numeroInvertido;
    };
});
