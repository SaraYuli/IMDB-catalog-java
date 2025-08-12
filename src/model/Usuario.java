package model;

public class Usuario extends Pessoa{

    private static int id;

    public Usuario(String nome, String dataNascimento, String  nacionalidade) {
        super(nome, dataNascimento, nacionalidade);
        this.id += 1;
    }
}
