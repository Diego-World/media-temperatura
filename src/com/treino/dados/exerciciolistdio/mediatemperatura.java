package com.treino.dados.exerciciolistdio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class mediatemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Clima> temperaturaMeses = new ArrayList<>();

        System.out.println("--------------- Wether Report---------------");
        System.out.println("- Digite as temperaturas do semestre -");

        int meses = 7;
        for (int i =1;i<meses;i++) {
            System.out.println("Digite o "+i+"° mes do ano e a temperatura média: ");
            temperaturaMeses.add(new Clima(sc.next(), sc.nextDouble()));
        }

        Iterator<Clima> soma = temperaturaMeses.iterator();
        double somaTemperatura = 0;
        while(soma.hasNext()){
            double proximaTemperatura = soma.next().getTemperatura();
            somaTemperatura += proximaTemperatura;
        }
        double media = somaTemperatura/temperaturaMeses.size();
        System.out.println(media%2d);

        List<String> mesesAcimaMedia = new ArrayList<>();

        Iterator<Clima> acimaMedia = temperaturaMeses.iterator();
        while(acimaMedia.hasNext()){
        double proximoTemp = acimaMedia.next().getTemperatura();
        String proximoMes = acimaMedia.next().getMeses();
        if(proximoTemp>media){
            mesesAcimaMedia.add(proximoMes);
            }
        }
        System.out.println("A temperatura ficou acima da média em:");
        for (String m:mesesAcimaMedia) {
            System.out.println(m);
        }
        sc.close();
    }

}
