// Espera até que o documento HTML seja totalmente carregado antes de executar o código.
document.addEventListener("DOMContentLoaded", function() {
    // Obtém uma referência para o elemento do botão "irParaTopo" pelo seu ID.
    let botaoIrParaTopo = document.getElementById("irParaTopo");

    // Adiciona um ouvinte de evento de clique ao botão "irParaTopo".
    botaoIrParaTopo.addEventListener("click", function() {
        // Faz com que a janela do navegador role suavemente para o topo.
        window.scroll({
            top: 0,           // Posição superior da rolagem, que é o topo da página.
            left: 0,          // Posição esquerda da rolagem, que é o início da página.
            behavior: "smooth" // Define a rolagem para ser suave.
        });
    });

    // Adiciona um "ouvinte" de evento de rolagem à janela.
    window.addEventListener("scroll", function() {
        // Verifica se a posição superior do documento (rolagem vertical) é maior que 100 pixels.
        if (document.documentElement.scrollTop > 100) {
            // Se sim, exibe o botão "irParaTopo" definindo seu estilo de exibição para "block".
            botaoIrParaTopo.style.display = "block";
        } else {
            // Caso contrário, oculta o botão "irParaTopo" definindo seu estilo de exibição para "none".
            botaoIrParaTopo.style.display = "none";
        }
    });
});
