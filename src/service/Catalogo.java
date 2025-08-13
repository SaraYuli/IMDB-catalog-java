package service;

import infra.CarregarDados;
import model.Ator;
import model.Avaliacao;
import model.Diretor;
import model.Filme;

import java.util.List;

public class Catalogo {

    private List<Ator> atoresCatalogo;
    private List<Diretor> diretoresCatalogo;
    private List<Filme> filmesCatalogo;
    private List<Avaliacao> avaliacoesCatalogo;

    public Catalogo() {
        //Carregar dados prévios, no construtor, com uma classe helper
        CarregarDados carregarDados = new CarregarDados();
        this.atoresCatalogo = carregarDados.getListAtores();
        this.diretoresCatalogo = carregarDados.getListDiretores();
        this.filmesCatalogo = carregarDados.getListFilmes();
        this.avaliacoesCatalogo = carregarDados.getListAvaliacoes();
    }

    public List<Ator> getAtoresCatalogo() {
        return atoresCatalogo;
    }

    public List<Diretor> getDiretoresCatalogo() {
        return diretoresCatalogo;
    }

    public List<Filme> getFilmesCatalogo() {
        return filmesCatalogo;
    }

    public List<Avaliacao> getAvaliacoesCatalogo() {
        return avaliacoesCatalogo;
    }

    public void exibirInformacoesFilme(int id) {
        // Extra para faciltar. TextBlockzinho do Java15 para formatar é amor.

        String infoCatalogo = """
        =================================
        Informações do Filme:
        ---------------------------------
        Título: %s
        Ano de Lançamento: %d
        Ator Principal: %s
        Diretor: %s
        Sinopse: %s
        =================================
        """.formatted(
                filmesCatalogo.get(id).getNomeFilme(),
                filmesCatalogo.get(id).getAnoLancamento(),
                atoresCatalogo.get(id).getNomePessoa(),
                diretoresCatalogo.get(id).getNomePessoa(),
                filmesCatalogo.get(id).getSinopse()
        );

        System.out.println(infoCatalogo);
    }
}
