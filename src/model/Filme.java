package model;

public class Filme {

    private Filme nomeFilme;
    private Ator atorPrincipal;
    private String dataLancamento;
    private String orcamento;
    private String descricao;

    public Filme() {
    }

    public Filme(Filme nomeFilme, String dataLancamento, String descricao) {
        this.nomeFilme = nomeFilme;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

}
