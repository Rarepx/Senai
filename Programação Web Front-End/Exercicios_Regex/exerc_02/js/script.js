function validarNumero() {
    let numero = document.getElementById("numero").value;
    let expressaoRegular = /^[0-9]+$/; // Esta expressão regular permite apenas dígitos numéricos.

    if (expressaoRegular.test(numero)) {
        alert("Número válido: " + numero);
    } else {
        alert("Número inválido. Insira apenas dígitos numéricos.");
    }
}

