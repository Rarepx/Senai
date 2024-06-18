$(document).ready(function() {
    // Espera até que o documento HTML seja completamente carregado e pronto

    let botaoIrParaTopo = $("#irParaTopo");
    // Selecione o elemento com o ID "irParaTopo" e armazene-o na variável "botaoIrParaTopo"

    botaoIrParaTopo.click(function() {
        // Quando o botão "botaoIrParaTopo" é clicado

        $("html, body").animate({
            // Animação da rolagem da página HTML e do corpo (body)
            scrollTop: 0
            // Rola para o topo (0 pixels do topo) da página
        }, "slow");
        // "Slow" especifica a velocidade da animação

    });

    $(window).scroll(function() {
        // Quando a janela de visualização é rolada (a ação de rolagem ocorre)

        if ($(document).scrollTop() > 100) {
            // Verifique se a posição vertical atual do documento é maior que 100 pixels do topo

            botaoIrParaTopo.css("display", "block");
            // Mostra o botão "botaoIrParaTopo" definindo o estilo de exibição como "block"
        } else {
            botaoIrParaTopo.css("display", "none");
            // Oculta o botão "botaoIrParaTopo" definindo o estilo de exibição como "none"
        }
    });
});
