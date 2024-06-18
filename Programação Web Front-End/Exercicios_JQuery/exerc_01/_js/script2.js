// Função para carregar o conteúdo da guia e atualizar a classe "guiAtiva"
function carregaItem(evento, opcaoMenu) {
    // Oculta todos os elementos com a classe "vetorConteudo"
    $(".vetorConteudo").hide();

    // Remove a classe "guiAtiva" de todos os elementos com a classe "vetorItens"
    $(".vetorItens").removeClass("guiAtiva");

    // Exibe o conteúdo da guia correspondente (com base no ID)
    $("#" + opcaoMenu).show();
    //: O # é um seletor usado no jQuery para selecionar elementos por ID. 
    //Quando colocamos # seguido de um valor (no caso, opcaoMenu), o jQuery 
    //procurará um elemento cujo id corresponda ao valor de opcaoMenu.
    
    // Adiciona a classe "guiAtiva" ao botão atual que foi clicado
    $(evento.currentTarget).addClass("guiAtiva");
}

// Aguarda até que o documento esteja pronto
$(document).ready(function() {
    // Encontra o botão de guia ativa (aquele com a classe "guiAtiva")
    let guiAtiva = $(".vetorItens.guiAtiva")[0];

    // Obtém o valor da guia a partir do atributo "onclick" do botão
    let opcaoMenu = guiAtiva.getAttribute("onclick").split("'")[1];

    // Chama a função carregaItem com os parâmetros corretos para carregar o conteúdo inicial
    carregaItem({ currentTarget: guiAtiva }, opcaoMenu);
});
