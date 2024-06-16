
// Espera até que o DOM esteja completamente carregado
document.addEventListener("DOMContentLoaded", function() {
    // Aguarda 2 segundo (1000 milissegundos) antes de exibir o pop-up
    setTimeout(function() {
        // Define a opacidade do pop-up como 1 para torná-lo visível
        document.getElementById("popUp").style.opacity = "1";
         // Define a propriedade de visibilidade como "visible" para exibir o pop-up
        document.getElementById("popUp").style.visibility = "visible";
    }, 2000);
});
// Adiciona um evento de clique no botão de fechar
document.querySelector(".close-button").addEventListener("click", function() {
  // Define a opacidade do pop-up como 0 para ocultá-lo  
  document.getElementById("popUp").style.opacity = "0";
  // Define a propriedade de visibilidade como "hidden" para ocultar o pop-up
  document.getElementById("popUp").style.visibility = "hidden";
});