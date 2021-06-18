package br.com.antonio.neves.set;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer ano_de_criacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer ano_de_criacao, String ide) {
        this.nome = nome;
        this.ano_de_criacao = ano_de_criacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno_de_criacao() {
        return ano_de_criacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano_de_criacao=" + ano_de_criacao +
                ", ide='" + ide + '\'' +
                '}';
    }



    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.nome.compareToIgnoreCase(linguagem.nome);
    }
}
