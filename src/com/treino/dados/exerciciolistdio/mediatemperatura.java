package com.treino.dados.exerciciolistdio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class mediatemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<>();
        List<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        System.out.println("--------------- Wether Report---------------");
        System.out.println("- Digite as temperaturas do semestre -");

        for (String mes:meses) {
            System.out.println("Temperatura média de: " + mes);
            temperatura.add(sc.nextDouble());
        }
        Iterator<Double> soma = temperatura.iterator();
        double somaTemperatura = 0;
        while(soma.hasNext()){
            double proximaTemperatura = soma.next();
            somaTemperatura += proximaTemperatura;
        }
        double media = somaTemperatura/temperatura.size();

        Iterator<Double> acimaMedia = temperatura.iterator();
        while(acimaMedia.hasNext()){
        double proximoTemp = acimaMedia.next();
        if(proximoTemp>media){
            // Hora da refatoração.
            }
        }
        sc.close();
    }

}
