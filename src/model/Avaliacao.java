package model;

public class Avaliacao {

    private static int id;

    private Filme filme;
    private Ator ator;
    private Diretor diretor;
    private double nota;
    private String comentario;

    public Avaliacao(double nota, Filme filme, Ator ator, Diretor diretor) {
        this.id += 1;
    }
}
