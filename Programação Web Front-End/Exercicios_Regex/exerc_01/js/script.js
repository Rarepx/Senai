function validarNome() {
    let nomeUsuario = document.getElementById("nomeUsuario").value;
    let expressaoRegular = /^[a-z]+$/; // Esta expressão regular permite apenas letras minúsculas.

    if (expressaoRegular.test(nomeUsuario)) {
        alert("Nome válido: " + nomeUsuario);
    } else {
        alert("Nome inválido. Insira apenas letras minúsculas.");
    }
}
