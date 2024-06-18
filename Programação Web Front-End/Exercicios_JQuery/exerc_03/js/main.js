$(document).ready(function() {
    let contador = 0;
    let animationInterval;
    let textosFinais = ['HELLO', 'WORLD']; // As palavras a serem exibidas
    let quadrosFundo = $('.quadroFundo .letra'); // Seleciona os elementos de letras

    function animacaoTexto() {
        // Verifica se a animação ainda está exibindo a primeira palavra
        if (contador < textosFinais[0].length) {
            let letraDesejada = textosFinais[0][contador]; // Obtém a próxima letra
            let elemento = quadrosFundo.eq(contador); // Obtém o elemento onde a letra será exibida
            elemento.text(letraDesejada); 
            contador++; // Move para a próxima letra
        }
        // Verifica se a animação está exibindo a segunda palavra
        else if (contador < textosFinais[0].length + textosFinais[1].length) {
            let letraDesejada = textosFinais[1][contador - textosFinais[0].length]; // Obtém a próxima letra
            let elemento = quadrosFundo.eq(contador); // Obtém o elemento onde a letra será exibida
            elemento.text(letraDesejada); // Define o conteúdo do elemento como a letra
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
});
