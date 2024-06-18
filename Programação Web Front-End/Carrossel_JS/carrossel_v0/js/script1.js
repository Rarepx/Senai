let indice = 1;
exibirImagem(1, indice);
  
  // Função chamada quando o usuário seleciona uma imagem em um grupo
  function imagemAtual(grupo, n) {
    exibirImagem(grupo, n);
  }

  // Função para exibir uma imagem específica em um grupo
  function exibirImagem(grupo, n) {
    let i;
    // Selecionar todas as imagens do grupo especificado
    let imagens = document.querySelectorAll(".conteudo:nth-child(" + grupo + ") .minhaImagem");

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

  //Observações sobre a linha 
  //let imagens = document.querySelectorAll(".conteudo:nth-child(" + grupo + ") .minhaImagem");
  //.conteudo: representa um seletor de classe CSS. Ele procura por elementos que têm a classe CSS chamada "conteudo". 
  // Isso significa que ele está selecionando todos os elementos no documento que possuem essa classe.

  //:nth-child(grupo): faz parte do seletor CSS que é usado para selecionar um elemento específico 
  //que é o "grupo" filho de outro elemento. 
  // O :nth-child é um seletor CSS que permite selecionar um elemento com base na sua posição relativa 
  // em relação ao seu pai. O valor "grupo" deve ser substituído por um número inteiro que indica a posição do elemento 
  // filho que desejamos selecionar.
