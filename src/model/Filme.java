package model;

public class Filme {

    public static int contadorId;
    private int idFilme;

    private String nomeFilme;
    private Ator atorPrincipal;
    private int anoLancamento;
    private String sinopse;

    public Filme (String nomeFilme, int anoLancamento) {
        this.nomeFilme = nomeFilme;
        this.anoLancamento = anoLancamento;
        this.idFilme = ++contadorId;
    }

    public int getId() {
        return this.idFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public Ator getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(Ator atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
