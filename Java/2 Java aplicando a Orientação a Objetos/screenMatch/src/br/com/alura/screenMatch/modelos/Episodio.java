package br.com.alura.screenMatch.modelos;

import br.com.alura.screenMatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private  String nome;
    private Serie serie;
    private int totalVizu;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotalVizu() {
        return totalVizu;
    }

    public void setTotalVizu(int totalVizu) {
        this.totalVizu = totalVizu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVizu > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
