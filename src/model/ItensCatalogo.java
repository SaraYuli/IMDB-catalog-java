package model;

public abstract class ItensCatalogo {
    private String titulo;
    //private String diretor;
    //private String ator;
    //private String descricao;
    //private int anoLancamento;
    //private String classficacaoIdade;

    public ItensCatalogo(String titulo ){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirInformacoesBasicas() {
        System.out.println("Titulo: " + this.titulo);
    }

    public abstract void exibirDetalhes();
}

