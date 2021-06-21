package br.com.antonio.neves.map;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t--");

        Map<String, Livro> meus_livros = new HashMap<>()  {{
            put("Hawking, Stepehn", new Livro("Uma Breve História do Tempo", 432));
            put("Duhigg, Chales", new Livro("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 436));
        }};
        for (Map.Entry <String, Livro>  livro : meus_livros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();


        System.out.println("--\tOrdem de inserção\t--");
        Map<String, Livro> meus_livros1 = new LinkedHashMap<>()  {
            {
                put("Hawking, Stepehn", new Livro("Uma Breve História do Tempo", 432));
                put("Duhigg, Chales", new Livro("O poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            }};
        for (Map.Entry <String, Livro>  livro : meus_livros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meus_livros2 = new TreeMap<>(meus_livros1);
        for (Map.Entry <String, Livro>  livro : meus_livros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meus_livros3 = new TreeSet<>(new ComparatorNome());
        meus_livros3.addAll(meus_livros.entrySet());
        for (Map.Entry <String, Livro>  livro : meus_livros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println();

        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, Livro>> meus_livros4 = new TreeSet<>(new ComparatorPagina());
        meus_livros4.addAll(meus_livros.entrySet());
        for (Map.Entry <String, Livro>  livro : meus_livros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        System.out.println();

    }

}
