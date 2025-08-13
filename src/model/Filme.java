package model;

public class Filme extends ItemCatalogo {
    private String duracao;

    public Filme(String titulo, String ator, String diretor, String genero, String duracao) {
        super(titulo, ator, diretor, genero);
        this.duracao = this.duracao;
    }

    public String getduracao() {
        return duracao;
    }
    public void setduracao(String duracao) {
        this.duracao = duracao;
    }

    public void exibirDetalhes() {
        this.exibirInformacoesBasicas();
        System.out.println("Duração: " + this.duracao);
    }
}

