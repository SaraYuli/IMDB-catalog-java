package model;

public abstract class ItemCatalogo {
    private String titulo;
    private String diretor;
    private String ator;
    private String genero;

    public ItemCatalogo(String titulo,  String diretor, String ator,  String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ator = ator;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirInformacoesBasicas() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ator: " + this.ator);
        System.out.println("Genero: " + this.genero);
    }

    public abstract void exibirDetalhes();
}

