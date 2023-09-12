function tocaSom(selectorAudio){
    const elemento = document.querySelector(selectorAudio);

    if(elemento && elemento.localName === 'audio' ){
        elemento.play();
    } 
    else{
        console.log('Elemento não encontrado ou seletor inválido');
    }
}

const listaDeTeclas = document.querySelectorAll('.tecla');

let contador = 0;

for (let contador = 0; contador < listaDeTeclas.length; contador++) {
    
    const tecla = listaDeTeclas[contador];
    const inst = tecla.classList[1];
    const idAudio = `#som_${inst}`;

    //console.log(idAudio);

    tecla.onclick = function(){
        tocaSom(idAudio);
    }

    tecla.onkeydown = function(evento){

        console.log(evento.code == 'Space');

        if (evento.code === 'Space' || evento.code === 'Enter') {
            tecla.classList.add('ativa');            
        }
    }

    tecla.onkeyup = function(){
        tecla.classList.remove('ativa');
    }
}