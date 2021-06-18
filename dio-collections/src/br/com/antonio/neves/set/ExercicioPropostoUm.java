package br.com.antonio.neves.set;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */


import java.util.*;

public class ExercicioPropostoUm {
    public static void main(String[] args) {

        Set<String> arco_iris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde",
                "Azul", "Anil", "Violeta"));

        System.out.println("Exiba as cores uma abaixo da outra: ");
        for (String cor : arco_iris)
            System.out.println(cor);
        System.out.println();

        System.out.println("Quantidade de cores do arco-íris: ");
        System.out.println(arco_iris.size() + "\n");

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> arco_iris_ordenado = new TreeSet<>(arco_iris);
        System.out.println(arco_iris_ordenado + "\n");

        System.out.println("Exiba as cores na ordem inversa que foi informada: ");
        Set<String> arco_iris_inverso = new LinkedHashSet<>(arco_iris);
        List<String> lista_inverso = new ArrayList<>(arco_iris_inverso);
        Collections.reverse(lista_inverso);
        System.out.println(lista_inverso + "\n");

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: arco_iris)
            if(cor.toLowerCase().startsWith("v"))
                System.out.println(cor);
        System.out.println();

        System.out.println("Remova todas as cores que não começam letra ”v” ");
        arco_iris.removeIf(s -> !s.toLowerCase().startsWith("v"));
        System.out.println(arco_iris + "\n");

        System.out.println("Limpe o conjunto");
        arco_iris.clear();
        System.out.println(arco_iris + "\n");

        System.out.println("Verifica se está vazio: ");
        System.out.println(arco_iris.isEmpty());


    }
}
