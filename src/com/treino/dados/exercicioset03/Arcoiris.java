package com.treino.dados.exercicioset03;

import java.util.*;

public class Arcoiris {
    public static void main(String[] args) {

        // Criar um set com as cores do arco iris e fazer os seguintes algoritmos:

        /*
        * A: Exiba todas a cores do arco íris uma abaixo da outra $
        * B: A quantidade de cores que o arco íris tem $
        * C: Exiba as cores em ordem alfabética
        * D: Exiba todas as cores na ordem inversa da que foi informada
        * E: Exiba todas as cores que começam com a letra "V"
        * F: Remova todas as cores que não começam com a letra "V"
        * G: Limpe o conjunto
        * H: Confira se o conjunto está vazio
        * */
        // Criação da estrutura
        Set<String> arcoIris = new LinkedHashSet<>(Arrays.asList("Vermelha","Laranja","Amarela","Verde","Azul","AzulEscuro","Violena"));

        Iterator<String> iterator = arcoIris.iterator();
        while(iterator.hasNext()){
            String cores = iterator.next();
            System.out.println(cores);
        }
        // Tamanho da estrutura
        System.out.println(arcoIris.size());

        // SortedSet passa os element em ordem alfabetica e numeros naturais
        SortedSet<String> arcoIrisAlfabetico = new TreeSet<>(arcoIris);
        System.out.println(arcoIrisAlfabetico);

        // Exibir ao inverso
        List<String> arcoIrisInvertido = new ArrayList<>(arcoIris);
        Collections.reverse(arcoIrisInvertido);
        System.out.println(arcoIrisInvertido);

        // Cores com a letra "V"
        for (String cor:arcoIris) {
            if(cor.startsWith("V")){
            System.out.println(cor);
            }
        }
        // Remover o que não começa com "V"

        Iterator<String> iterator2 = arcoIrisInvertido.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) {
                iterator2.remove();
            }
        }
        System.out.println(arcoIrisInvertido);

        // Limpar o conjunto
        arcoIris.clear();
        System.out.println(arcoIris);

        // ta vazio?
        System.out.println(arcoIris.isEmpty());

    }
}
