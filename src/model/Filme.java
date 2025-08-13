package model;

public class Filme extends ItensCatalogo {
    //private String duracao;

    public Filme(String titulo) {
        super(titulo);
        //this.duracao = duracao;
    }

//    public String getduracao() {
//        return duracao;
//    }
//    public void setduracao(String duracao) {
//        this.duracao = duracao;
//    }

    public void exibirDetalhes() {
        this.exibirInformacoesBasicas();
//        System.out.println("Duração: " + this.duracao);
    }
}

