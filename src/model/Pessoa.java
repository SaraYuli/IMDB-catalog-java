package model;

import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private Date dataNascimento;
    private String nacionalidade;
    
    public Pessoa(){}

    public Pessoa(String nome, int dataNascimento, String nacionalidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;

    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getNacionalidade(){
        return nacionalidade;

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public abstract String getDescricao();

    @Override
     public String toString(){
        return "Nome: " + nome + "Nascimento: " + dataNascimento + "Nacionalidade: "+ nacionalidade;
        }
}
