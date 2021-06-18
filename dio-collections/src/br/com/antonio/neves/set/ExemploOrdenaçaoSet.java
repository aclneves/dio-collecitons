package br.com.antonio.neves.set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.*;

public class ExemploOrdenaçaoSet {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comedia", 30));
        }};

        System.out.println("--\tOrdem aleatória\t--");
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comedia", 30));
        }};
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
            minhasSeries4.addAll(minhasSeries3);

        for (Serie serie : minhasSeries4)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();


    }







}


