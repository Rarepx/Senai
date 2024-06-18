function removerEspacosDuplicados() {
    let entradaTexto = document.getElementById("entradaTexto").value;
    let expressaoRegular = /\s+/g; // Esta expressão regular corresponde a um ou mais espaços em branco.
    let textoSemEspacosDuplicados = entradaTexto.replace(expressaoRegular, ' ');

    document.getElementById("resultado").textContent = textoSemEspacosDuplicados;
}


