let indice = 1;
exibirImagem(indice);

// Função para avançar ou retroceder nas imagens
function direcaoSlides(n) {
    exibirImagem(indice = indice + n); // Incrementa ou decrementa 'indice' e chama 'exibirImagem'
}

// Função para exibir uma imagem com base no índice 'n'
function exibirImagem(n) {
    let i, imagens = document.getElementsByClassName("minhaImagem"); // Obtém elementos com a classe 'minhaImagem'

    // Se 'n' for maior que o número de imagens, volte para a primeira imagem
    if (n > imagens.length) {
        indice = 1;
    }

    // Se 'n' for menor que 1, vá para a última imagem
    if (n < 1) {
        indice = imagens.length;
    }

    // Oculta todas as imagens definindo 'display' para 'none'
    for (i = 0; i < imagens.length; i++) {
        imagens[i].style.display = "none";
    }
    // Exibe a imagem correspondente com base no 'indice' atual
    imagens[indice - 1].style.display = "block";
}
