function inverterNumero() {
    let numero = document.getElementById("numeroInput").value;

    // Converte o número para string, inverte seus caracteres e converte de volta para número.
    let numeroInvertido = +(numero.toString().split("").reverse().join(""));

    exibirResultado(numeroInvertido);
}

function exibirResultado(resultado) {
    document.getElementById("resultado").textContent = resultado;
}
