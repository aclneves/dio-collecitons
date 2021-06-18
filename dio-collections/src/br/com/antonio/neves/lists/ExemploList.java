package br.com.antonio.neves.lists;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString() + "\n");

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5.0)+ "\n");

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas + "\n");

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(3, 6.0);
        System.out.println(notas + "\n");

        System.out.println("Confira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5.0) + "\n");

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        for (double nota : notas) System.out.println(nota);
        System.out.println();

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2) + "\n");

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas) + "\n");

        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas) + "\n");

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma + "\n");

        System.out.println("Exiba a média das notas");
        System.out.println(soma/notas.size() + "\n");

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7.0)
                iterator1.remove();
            }
        System.out.println(notas + "\n");

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas + "\n");

        System.out.println("Confira se está vazia: " + notas.isEmpty());

        }


    }
