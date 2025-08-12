package model;

public class Diretor extends Pessoa {

    private static int id;

    private String nomeDiretor;
    private String dataNascimento;
    private String conjuge;
    private String nomeFilhos;
    private String breveDescricao;
    private String nacionalidade;

    public Diretor(String nome, String dataNascimento, String nacionalidade) {
        super(nome, dataNascimento, nacionalidade);
        this.id += 1;
    }

}
