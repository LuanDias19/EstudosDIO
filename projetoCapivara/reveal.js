ScrollReveal().reveal(".conteudo-principal", {
  origin: "top",
  distance: "50px",
  duration: 1000,
  delay: 200,
  easing: "ease-out",
  reset: false,
});

ScrollReveal().reveal(".conteudo-secundario", {
  origin: "top",
  distance: "60px",
  duration: 1000,
  delay: 300,
  easing: "ease-out",
  reset: false,
  viewFactor: 0.1,
  opacity: 1,
});

const form = document.getElementById("form-capivara");
const mensagem = document.getElementById("mensagem-obrigado");
const botao = document.getElementById("botao-enviar");

form.addEventListener("input", function () {
  botao.disabled = !form.checkValidity();
});

form.addEventListener("submit", function (e) {
  e.preventDefault();
  form.style.display = "none";
  mensagem.style.display = "block";
});

form.addEventListener("reset", function () {
  mensagem.style.display = "none";
  botao.disabled = true;
});

document
  .querySelector('a[href="#contato"]')
  .addEventListener("click", function (e) {
    e.preventDefault();
    const box = document.getElementById("caixa-contato");
    box.style.display = box.style.display === "none" ? "block" : "none";
  });
