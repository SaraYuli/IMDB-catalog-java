package model;

public class Ator extends Pessoa {

    private int id;

    public Ator(String nome, String dataNascimento, String nacionalidade) {
        super(nome, dataNascimento, nacionalidade);
        this.id += 1;
    }

}
