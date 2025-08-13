package model;

import java.util.Date;

public class Diretor extends Pessoa {

    private static int id;

    private String breveDescricao;

    public Diretor(String nome, String dataNascimento, String nacionalidade) {
        super(nome, dataNascimento, nacionalidade);
        this.id = ++contadorId;
    }

    public int getIdPessoa() {
        return this.id;
    }

    public String getBreveDescricao() {
        return breveDescricao;
    }

    public void setBreveDescricao(String breveDescricao) {
        this.breveDescricao = breveDescricao;
    }
}
