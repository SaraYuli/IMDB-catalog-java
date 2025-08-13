package model;

public class Avaliacao {

    public static int contadorId;
    private int idAvaliacao;

    private Filme filme;
    private Ator ator;
    private Diretor diretor;
    private double nota;
    private String comentario;

    public Avaliacao(double nota, Filme filme, Ator ator, Diretor diretor) {
        this.ator = ator;
        this.diretor = diretor;
        this.filme = filme;
        this.nota = nota;
        this.idAvaliacao = ++contadorId;
    }

    public int getId() {
        return this.idAvaliacao;
    }

    public double getNota(){
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
