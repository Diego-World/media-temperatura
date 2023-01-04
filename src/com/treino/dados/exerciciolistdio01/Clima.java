package com.treino.dados.exerciciolistdio01;

public class Clima {

    private String meses;
    private double temperatura;

    public Clima(String meses, double temperatura) {
        this.meses = meses;
        this.temperatura = temperatura;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
