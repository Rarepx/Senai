const dropdownBtn = document.querySelector(".botaoDropdown");
const dropdownMenu = document.querySelector(".menuDropdown");

  dropdownBtn.addEventListener("click", () => {
  dropdownMenu.classList.toggle("show");
  dropdownBtn.classList.toggle("destaque");
  dropdownBtn.querySelector(".seta").classList.toggle("paraBaixo");
  }
);
   
   