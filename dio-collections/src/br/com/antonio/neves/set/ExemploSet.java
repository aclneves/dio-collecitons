package br.com.antonio.neves.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6]

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas + "\n");

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println("Não é possível utilizando hashset" + "\n");

        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        System.out.println("Não é possível utilizando hashset" + "\n");

        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        System.out.println("Não é possível utilizando hashset" + "\n");

        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5d) + "\n");

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println("Não é possível utilizando hashset" + "\n");

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas) + "\n");

        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas) + "\n");

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores é: " + soma + "\n");

        System.out.println("Exiba a média das notas: ");
        System.out.println(soma/notas.size() + "\n");

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova a nota da posição 0: ");
        System.out.println("Não é possível utilizando hashset" + "\n");

        System.out.println("Remova as notas menoes que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas + "\n");

        System.out.println("Exiba todas as notas na ordem que foram informadas ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList());
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2 + "\n");

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3 + "\n");

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println(notas + "\n");

        System.out.println("Confira se o conjunto está vazio: ");
        System.out.println(notas.isEmpty() + "\n");

        System.out.println(notas2.isEmpty());



    }
}