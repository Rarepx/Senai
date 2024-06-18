function validarTelefone() {
    var telefone = document.getElementById("telefone").value;
    var expressaoRegular = /^\d{2} \d{5}-\d{4}$/; // Esta expressão regular corresponde ao formato "99 99999-9999".

    if (expressaoRegular.test(telefone)) {
        document.getElementById("resultado").textContent = "Número de telefone válido: " + telefone;
    } else {
        document.getElementById("resultado").textContent = "Número de telefone inválido. Use o formato: 99 99999-9999.";
    }
}

