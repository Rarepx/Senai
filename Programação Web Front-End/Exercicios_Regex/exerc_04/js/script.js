function validarCEP() {
    let cep = document.getElementById("cep").value;
    let expressaoRegular = /^\d{5}-\d{3}$/; // Esta expressão regular corresponde ao formato "99999-999".

    if (expressaoRegular.test(cep)) {
        document.getElementById("resultado").textContent = "CEP válido: " + cep;
    } else {
        document.getElementById("resultado").textContent = "CEP inválido. Use o formato: 99999-999.";
    }
}
