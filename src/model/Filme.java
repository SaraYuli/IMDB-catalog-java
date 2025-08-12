package model;

public class Filme {

    private static int id;

    private String nomeFilme;
    private String atorPrincipal;
    private int anoLancamento;
    private String orcamento;
    private String sinopse;

    public Filme() {
        this.id += 1;
    }

    public Filme (String nomeFilme, int anoLancamento) {
        this.nomeFilme = nomeFilme;
        this.anoLancamento = anoLancamento;
    }

    public static int getId() {
        return id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
