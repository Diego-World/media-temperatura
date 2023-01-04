package com.treino.dados.exerciciolistdio02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Investigador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int contador = 0;

        for (String pergunta:perguntas) {

            System.out.println(pergunta);
            System.out.println(" Responda Sim ou Não >:( ");
            String respostaPositiva = sc.next();

            if(respostaPositiva.contains("s")){
                contador++;
            }

        }

        switch(contador) {
            case 2:
                System.out.println("SUSPEITA ");
                break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINO");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }
    }
}
