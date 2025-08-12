package service;

import model.Ator;
import model.Diretor;
import model.Filme;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private final List<Ator> listaAtores = new ArrayList<>();
    private final List<Diretor> listaDiretores = new ArrayList<>();
    private final List<Filme> listaFilmes = new ArrayList<>();


    public void adicionarAtor(Ator ator) {
        listaAtores.add(ator);
    }

    public void adicionarDiretor(Diretor diretor) {
        listaDiretores.add(diretor);
    }

    public void adicionarFilme(Filme filme) {
        listaFilmes.add(filme);
    }

    public List<Ator> getListaAtores() {
        return listaAtores;
    }

    public List<Diretor> getListaDiretores() {
        return listaDiretores;
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }
}
