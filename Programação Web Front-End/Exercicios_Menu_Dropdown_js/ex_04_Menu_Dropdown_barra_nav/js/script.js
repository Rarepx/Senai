document.addEventListener("DOMContentLoaded", inicializar);

function inicializar() {
    let dropdownBtn = document.querySelector(".btnDropdown");
    dropdownBtn.addEventListener("click", alternarDropdown);
    document.addEventListener("click", fecharDropdown);
}

function alternarDropdown(event) {
    let dropdownMenu = document.querySelector(".menuDropdown");
    dropdownMenu.classList.toggle("exibir");
    event.stopPropagation(); // Impede que o clique no dropdown propague para o documento
}

function fecharDropdown(event) {
    let dropdownBtn = document.querySelector(".btnDropdown");
    let dropdownMenu = document.querySelector(".menuDropdown");
    if (!event.target.matches('.btnDropdown')) {
        dropdownMenu.classList.remove("exibir");
        dropdownBtn.classList.remove("destaque");
    }
}
