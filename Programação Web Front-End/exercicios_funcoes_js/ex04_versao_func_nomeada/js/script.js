function contarVogais() {
    let texto = document.getElementById("textoInput").value.toLowerCase();

    // Define uma lista de vogais.
    let vogais = ['a', 'e', 'i', 'o', 'u'];

    // Inicializa o contador de vogais.
    let contador = 0;

    // Itera sobre cada caractere do texto.
    for (let i = 0; i < texto.length; i++) {
        // Verifica se o caractere atual é uma vogal.
        if (vogais.includes(texto[i])) {
            contador++;
        }
    }

    exibirResultado(contador);
}

function exibirResultado(resultado) {
    document.getElementById("resultado").textContent = resultado;
}
