function validarRG() {
    var rg = document.getElementById("rg").value;
    var expressaoRegular = /^\d{2}\.\d{3}\.\d{3}-\d$/; // Esta expressão regular corresponde ao formato "99.999.999-9".

    if (expressaoRegular.test(rg)) {
        document.getElementById("resultado").textContent = "RG válido: " + rg;
    } else {
        document.getElementById("resultado").textContent = "RG inválido. Use o formato: 99.999.999-9.";
    }
}

