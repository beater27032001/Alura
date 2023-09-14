package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {
        Musica myMusic = new Musica();
        myMusic.setTitulo("Forever");
        myMusic.setCantor("Kiss");

        for (int i = 0; i < 1000; i++){
            myMusic.reproduz();
        }

        for (int i = 0; i < 50; i++){
            myMusic.curti();
        }

        PodCast myPod = new PodCast();
        myPod.setTitulo("PodPah");
        myPod.setApresentador("Igão");

        for (int i = 0; i < 5000; i++){
            myPod.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            myPod.curti();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(myPod);
        minhasPreferidas.inclui(myMusic);
    }
}
