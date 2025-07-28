const container = document.querySelector('.capivarinhas-container');
const imgSrc = 'images/capivara.png'; // ajuste caminho se precisar

function criarCapivara() {
  const capivara = document.createElement('img');
  capivara.src = imgSrc;
  capivara.classList.add('capivara');

  capivara.style.left = Math.random() * 90 + 'vw';

  const duracao = 5000 + Math.random() * 5000;
  capivara.style.animationDuration = duracao + 'ms';

  const delay = -Math.random() * duracao;
  capivara.style.animationDelay = delay + 'ms';

  container.appendChild(capivara);

  setTimeout(() => capivara.remove(), duracao);
}

setInterval(criarCapivara, 800);
for(let i=0; i<5; i++) setTimeout(criarCapivara, i*400);
