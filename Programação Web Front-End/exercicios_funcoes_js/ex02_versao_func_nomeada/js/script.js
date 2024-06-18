function habilitarRaiz() {
    document.getElementById("raizDiv").style.display = "block";
    document.getElementById("exponencialDiv").style.display = "none";
}

function habilitarExponencial() {
    document.getElementById("raizDiv").style.display = "none";
    document.getElementById("exponencialDiv").style.display = "block";
}

function calcularRaiz() {
    let numero = parseFloat(document.getElementById("numeroRaiz").value);

    if (numero < 0) {
        exibirResultado("Erro: Não é possível calcular a raiz de um número negativo.");
    } else {
        let resultado = Math.sqrt(numero);
        exibirResultado(resultado);
    }
}

function calcularExponencial() {
    let base = parseFloat(document.getElementById("base").value);
    let expoente = parseFloat(document.getElementById("expoente").value);

    if ((!isNaN(base)) && (!isNaN(expoente))) {
        let resultado = Math.pow(base, expoente);
        exibirResultado(resultado);
    } else {
        exibirResultado("Erro: Valores de base ou expoente inválidos.");
    }
}

function exibirResultado(resultado) {
    document.getElementById("resultado").textContent = resultado;
}
