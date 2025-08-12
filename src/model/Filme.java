package model;

public class Filme {

    private static int id;

    private String nomeFilme;
    private String atorPrincipal;
    private String dataLancamento;
    private String orcamento;
    private String sinopse;

    public Filme() {
        this.id += 1;
    }

    public Filme (String nomeFilme, String dataLancamento, String sinopse) {
        this.nomeFilme = nomeFilme;
        this.dataLancamento = dataLancamento;
        this.sinopse = sinopse;
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

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
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
