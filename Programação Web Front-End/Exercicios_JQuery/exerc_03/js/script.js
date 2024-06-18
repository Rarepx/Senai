// Define uma função chamada iniciarAnimacao
function iniciarAnimacao() {
    // Inicializa variáveis locais
    let contador = 0; 
    let animationInterval; 
    let textosFinais = ['HELLO', 'WORLD']; // As palavras a serem exibidas
    let quadrosFundo = document.querySelectorAll('.quadroFundo .letra'); // Seleciona os elementos de letras

    // Define a função que realiza a animação
    function animacaoTexto() {
        // Verifica se a animação ainda está exibindo a primeira palavra
        if (contador < textosFinais[0].length) {
            let letraDesejada = textosFinais[0][contador]; // Obtém a próxima letra
            let elemento = quadrosFundo[contador]; // Obtém o elemento onde a letra será exibida
            elemento.textContent = letraDesejada; // Define o conteúdo do elemento como a letra
            contador++; // Move para a próxima letra
        }
        // Verifica se a animação está exibindo a segunda palavra
        else if (contador < textosFinais[0].length + textosFinais[1].length) {
            let letraDesejada = textosFinais[1][contador - textosFinais[0].length]; // Obtém a próxima letra
            let elemento = quadrosFundo[contador]; // Obtém o elemento onde a letra será exibida
            elemento.textContent = letraDesejada; // Define o conteúdo do elemento como a letra
            contador++; // Move para a próxima letra
        }
        // Se a animação estiver completa, limpa o intervalo
        else {
            clearInterval(animationInterval);
        }
    }

    // Define a função para reiniciar a animação
    function reiniciarAnimacao() {
        contador = 0; 
        animationInterval = setInterval(animacaoTexto, 80); // Inicia a animação com intervalo de 80 milissegundos
    }

    // Aguarda um tempo (1500 ms) antes de iniciar a animação
    setTimeout(reiniciarAnimacao, 1500);
}

// Chama a função para iniciar a animação
iniciarAnimacao();
