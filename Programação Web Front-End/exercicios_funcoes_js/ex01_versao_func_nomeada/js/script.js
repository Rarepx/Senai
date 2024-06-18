function calcularAdicao() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);
    let resultado = (numero1 + numero2);
    exibirResultado(resultado);
}

function calcularSubtracao() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);
    let resultado = (numero1 - numero2);
    exibirResultado(resultado);
}

function calcularMultiplicacao() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);
    let resultado = (numero1 * numero2);
    exibirResultado(resultado);
}

function calcularDivisao() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);

    if (numero2 == 0) {
        exibirResultado("Erro: Divsão por zero não é permitida!");
    } else {
        let resultado = (numero1 / numero2);
        exibirResultado(resultado);
    }
}

function exibirResultado(resultado) {
    document.getElementById("resultado").textContent = resultado;
}
