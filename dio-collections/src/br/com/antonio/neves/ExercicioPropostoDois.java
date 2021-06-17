package br.com.antonio.neves;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.*;

public class ExercicioPropostoDois {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima? - Responda (s) ou (n)");
        String resposta = in.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime? - Responda (s) ou (n)");
        resposta = in.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima? - Responda (s) ou (n)");
        resposta = in.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vítima? - Responda (s) ou (n)");
        resposta = in.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Já trabalhou com a vítima? - Responda (s) ou (n)");
        resposta = in.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int contador = 0;
        for (String verdade : respostas) {
            if (verdade.contains("s"))
                contador++;
        }

        switch (contador) {
            case 2:
                System.out.println("PESSOA SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println("PESSOA CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINA");
                break;
            default:
                System.out.println("INOCENTE");
                break;

        }

    }
}
