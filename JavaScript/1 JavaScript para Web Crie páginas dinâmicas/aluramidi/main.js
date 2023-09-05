function tocaSom(idElementoAudio){
    document.querySelector(idElementoAudio).play();
}

const listaDeTeclas = document.querySelectorAll('.tecla');

let contador = 0;

for (let contador = 0; contador < listaDeTeclas.length; contador++) {
    
    const tecla = listaDeTeclas[contador];
    const inst = tecla.classList[1];
    const idAudio = `#som_${inst}`;

    console.log(idAudio);

    tecla.onclick = function(){
        tocaSom(idAudio);
    }
}