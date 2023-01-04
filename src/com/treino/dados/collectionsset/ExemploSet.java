package com.treino.dados.collectionsset;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5d,0d,3.6d,9.3d,6d,7d));
        System.out.println(notas);

        // Não da pra trabalhar com index no "Set"; Não tem get e set;

        System.out.println(notas.contains(5d));

        // Como set é uma collections contamos com diversos metódos, exemplo maior e menor elemento da estrutura:
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        // Para somar usamos o iterator, criando uma variavel soma e percorrendo a estrutura;
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            double proximo = iterator.next();
            soma += proximo;
        }
        System.out.println(soma);

        System.out.println(soma/ notas.size());
        System.out.println("Removendo o 0 da estrutura"+notas.remove(0d));

        // remover as notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            double next = iterator1.next();
            if(next<7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

    }

}
