function carregaItem(evento, opcaoMenu) {
  // Oculta todos os elementos com a classe "vetorConteudo"
  let vetorConteudo = document.getElementsByClassName("vetorConteudo");
  for (let i = 0; i < vetorConteudo.length; i++) {
    vetorConteudo[i].style.display = "none";
  }

  // Remove a classe "guiAtiva" de todos os elementos com a classe "vetorItens"
  let vetorItens = document.getElementsByClassName("vetorItens");
  for (let i = 0; i < vetorItens.length; i++) {
    vetorItens[i].classList.remove("guiAtiva");
  }

  // Exibe o elemento com o ID correspondente
  document.getElementById(opcaoMenu).style.display = "block";

  // Adiciona a classe "guiAtiva" ao botão atual
  evento.currentTarget.classList.add("guiAtiva");
  // evento.currentTarget se refere ao botão que foi clicado.
  // classList.add("guiAtiva") é usado para adicionar uma classe chamada "guiAtiva" 
  // ao elemento DOM (nesse caso, o botão que foi clicado). A classe "guiAtiva" é usada 
  // para estilizar o botão que representa a guia ativa ou selecionada
}

// Executa esse código quando a página for carregada
window.addEventListener("load", function(){  
  // Obter o botão tab ativo
  let guiAtiva = document.querySelector(".vetorItens.guiAtiva");

  // Obter o ID correspondente a partir do atributo 'onclick' do botão
  let opcaoMenu = guiAtiva.getAttribute("onclick").match(/'(.*?)'/)[1];
 //tem como objetivo obter o valor entre as aspas simples no atributo "onclick" do elemento guiAtiva

  // Chama a função carregaItem com os parâmetros corretos
  carregaItem({ currentTarget: guiAtiva }, opcaoMenu);
});

// guiAtiva.getAttribute("onclick"): Isso obtém o valor do atributo "onclick" 
// do elemento referenciado pela variável guiAtiva. O atributo "onclick" é frequentemente usado para associar uma ação a um evento de clique em JavaScript. 

//.match(/'(.*?)'/): a função match é usada para encontrar uma correspondência dentro 
// do conteúdo do atributo "onclick". A expressão regular /'(.*?)'/ é usada para encontrar uma sequência 
// que esteja entre aspas simples ('). O .*? é um padrão na expressão regular que corresponde a qualquer sequência de caracteres (.*), 
// mas o ? faz com que a correspondência seja não gananciosa, ou seja, ela corresponderá à menor sequência possível. Isso significa 
// que ele tentará encontrar o menor texto possível entre as aspas simples.

//[1]: Esta parte do código pega o primeiro grupo capturado pela expressão regular. No caso da expressão regular usada, 
// é a sequência de caracteres que está entre as aspas simples no código "onclick". Se houver várias correspondências, pega a primeira. 
// a sequência de caracteres entre as aspas simples normalmente parece algo assim: 'Opcao1'
