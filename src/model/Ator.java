package model;

public class Ator extends Pessoa {

    private String personagemMaisFamoso;
    private String premiacoes;

    public Ator(String nome, String dataNascimento, String nacionalidade) {
        super(nome, dataNascimento, nacionalidade);
    }

    public String getPersonagemMaisFamoso() {
        return personagemMaisFamoso;
    }

    public void setPersonagemMaisFamoso(String personagemMaisFamoso) {
        this.personagemMaisFamoso = personagemMaisFamoso;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }
}
