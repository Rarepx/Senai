// Espera o documento HTML ser totalmente carregado antes de executar a função inicializar.
document.addEventListener("DOMContentLoaded", inicializar);

// Função de inicialização.
function inicializar() {
  let dropdownBtn = document.querySelector(".btnDropdown");
  dropdownBtn.addEventListener("click", alternarDropdown);

  // Adiciona um evento de "escuta" de clique no documento para fechar o dropdown.
  document.addEventListener("click", fecharDropdown);
}

// Função para alternar a exibição do dropdown.
function alternarDropdown(event) {
  let dropdownMenu = document.querySelector(".menuDropdown");
  dropdownMenu.classList.toggle("exibir");
  event.stopPropagation(); // Impede que o clique no dropdown propague para o documento
}

// Função para fechar o dropdown quando o usuário clica fora dele.
function fecharDropdown(event) {
  let dropdownBtn = document.querySelector(".btnDropdown");
  let dropdownMenu = document.querySelector(".menuDropdown");
  let menusDropdown = document.querySelectorAll(".menuDropdown");

  if (!event.target.matches('.btnDropdown')) {
    dropdownMenu.classList.remove("exibir");
    dropdownBtn.classList.remove("destaque");

    for (let i = 0; i < menusDropdown.length; i++) {
      let menuDropdown = menusDropdown[i];
      if (menuDropdown.classList.contains('exibir')) {
        menuDropdown.classList.remove('exibir');
      }
    }
  }
}

