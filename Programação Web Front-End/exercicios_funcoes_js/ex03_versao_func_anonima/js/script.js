document.addEventListener("DOMContentLoaded", function () {
    let numeroInput = document.getElementById("numeroInput");
    let inverterBtn = document.getElementById("inverterBtn");
    let resultado = document.getElementById("resultado");

    inverterBtn.addEventListener("click", function () {
        let numero = numeroInput.value;

        // Converte o número para string, inverte seus caracteres e converte de volta para número.
        let numeroInvertido = +(numero.toString().split("").reverse().join(""));

        exibirResultado(numeroInvertido);
    });

    function exibirResultado(numeroInvertido) {
        resultado.textContent = numeroInvertido;
    }
});
