// Função chamada quando o usuário seleciona uma imagem em um grupo
function imagemAtual(grupo, n) {
  exibirImagem(grupo, n);
}

// Função para exibir uma imagem específica em um grupo
function exibirImagem(grupo, n) {
  let i;
  // Selecionar todas as imagens do grupo especificado
  let imagens = document.querySelectorAll(`.container:nth-child(${grupo}) .minhaImagem`);

  // Verificar se o índice fornecido está fora do intervalo
  if (n > imagens.length) {
    n = 1;
  }

  if (n < 1) {
    n = imagens.length;
  }

  // Ocultar todas as imagens do grupo
  for (i = 0; i < imagens.length; i++) {
    imagens[i].style.display = "none";
  }

  // Exibir a imagem selecionada
  imagens[n - 1].style.display = "block";
}

exibirImagem(1, 1);
exibirImagem(2, 1);
exibirImagem(3, 1);
exibirImagem(4, 1);