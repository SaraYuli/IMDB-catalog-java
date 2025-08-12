package model;

public class Diretor extends Pessoa {

    private int numeroFilmesDirigidos;
    private String estiloCinematografico;

    public Diretor(String nome, String dataNascimento, String nacionalidade) {
        super(nome, dataNascimento, nacionalidade);
    }

    public int getNumeroFilmesDirigidos() {
        return numeroFilmesDirigidos;
    }

    public void setNumeroFilmesDirigidos(int numeroFilmesDirigidos) {
        this.numeroFilmesDirigidos = numeroFilmesDirigidos;
    }

    public String getEstiloCinematografico() {
        return estiloCinematografico;
    }

    public void setEstiloCinematografico(String estiloCinematografico) {
        this.estiloCinematografico = estiloCinematografico;
    }
}
