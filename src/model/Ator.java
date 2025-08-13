package model;

public class Ator extends Pessoa {

    private int id;

    public Ator(String nomePessoa, String dataNascimento, String nacionalidade) {
        super(nomePessoa, dataNascimento, nacionalidade);
        this.id = ++contadorId;
    }

    public int getIdPessoa() {
        return this.id;
    }


}
