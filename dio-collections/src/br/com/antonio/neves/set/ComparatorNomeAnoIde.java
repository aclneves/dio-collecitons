package br.com.antonio.neves.set;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;
        int ano = Integer.compare(l1.getAno_de_criacao(), l2.getAno_de_criacao());
        if (ano != 0) return ano;
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
