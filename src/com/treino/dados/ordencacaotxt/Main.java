package com.treino.dados.ordencacaotxt;

import lombok.ToString;

import java.io.*;

import java.util.*;

@ToString
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("Z:\\STUDIES\\backEnd\\dados\\txt\\emails.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();

        try{
        String linhas = bufReader.readLine();
        while(linhas != null){
            linhas = linhas.replaceAll("[<>]", "");
            linhas = linhas.replaceAll("\"", "");
            linhas = linhas.replace(",", "");
            linhas = linhas.replace(" ", "");

            int index = linhas.indexOf(".com");
            if (index >= 0) {
                String before = linhas.substring(0, index + 4);
                String after = linhas.substring(index + 4);
                linhas = before + "\n";
            }

            int indexBr = linhas.indexOf(".br");
            if (index >= 0) {
                String before = linhas.substring(0, index + 4);
                String after = linhas.substring(index + 4);
                linhas = before + "\n";
            }

            System.out.println(linhas);
            linhas = bufReader.readLine();
        }
    }catch (IOException exception){
            exception.getMessage();
        }finally {
            bufReader.close();
        }



    }
}


