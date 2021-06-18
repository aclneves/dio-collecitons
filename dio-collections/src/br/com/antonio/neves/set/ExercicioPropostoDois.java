package br.com.antonio.neves.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioPropostoDois {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new HashSet<>() {{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("Python", 1989, "PyCharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
        }};

        System.out.println("--\tOrdem de inserção\t--");
        Set<LinguagemFavorita> linguagens2 = new LinkedHashSet<>(linguagens);
        System.out.println(linguagens2 + "\n");

        System.out.println("--\tOrdem Natural(nome)\t--");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens);
        System.out.println(linguagens3 + "\n");

        System.out.println("--\tOrdem de IDE\t--");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorIde());
        linguagens4.addAll(linguagens);
        System.out.println(linguagens4 + "\n");

        System.out.println("--\tOrdem de Ano/Nome\t--");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorAnoNome());
        linguagens5.addAll(linguagens);
        System.out.println(linguagens5 + "\n");

        System.out.println("--\tOrdem de Nome/Ano/IDE\t--");
        Set<LinguagemFavorita> linguagens6 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens6.addAll(linguagens);
        System.out.println(linguagens6);



    }
}
