package infra;

import model.Ator;
import model.Avaliacao;
import model.Diretor;
import model.Filme;

import java.util.ArrayList;
import java.util.List;

public class CarregarDados {

    //Classe utilitária para inserir dados ao rodar o programa, por não utilizarmos persistência neste projeto

    private List<Filme> listFilmes = new ArrayList<>();
    private List<Ator> listAtores = new ArrayList<>();
    private List<Diretor> listDiretores = new ArrayList<>();
    private List<Avaliacao> listAvaliacao = new ArrayList<>();

    public CarregarDados() {

        //Arrays pre-setados
        String[] nomesFilmes = {
                "SpiderMan", "X-Men Origins: Wolverine", "Inception", "Interstellar",
                "The Dark Knight", "Avatar", "Titanic", "The Matrix",
                "Gladiator", "The Social Network"};

        int[] anos = { 2002, 2016, 2010, 2014, 2008, 2009, 1997, 1999, 2000, 2010 };

        String[] nomesAtor = {
                "Tobey Maguire", "Hugh Jackman", "Leonardo DiCaprio", "Matthew McConaughey",
                "Christian Bale", "Sam Worthington", "Leonardo DiCaprio", "Keanu Reeves",
                "Russell Crowe", "Jesse Eisenberg"
        };
        String[] nascimentosAtor = {
                "27061975", "12101968", "11111974", "04111969",
                "30011974", "02081976", "11111974", "02091964",
                "07041964", "05101983"
        };
        String[] nacAtor = {
                "Estadunidense", "Australiano", "Estadunidense", "Estadunidense",
                "Britânico", "Britânico", "Estadunidense", "Canadense",
                "Neozelandês", "Estadunidense"
        };

        String[] nomesDiretor = {
                "Sam Raimi", "Gavin Hood", "Christopher Nolan", "Christopher Nolan",
                "Christopher Nolan", "James Cameron", "James Cameron", "The Wachowskis",
                "Ridley Scott", "David Fincher"
        };
        String[] nascimentosDir = {
                "23101959", "12051963", "30071970", "30071970",
                "30071970", "16081954", "16081954", "29061965",
                "30111937", "28121962"
        };
        String[] nacDir = {
                "Estadunidense", "Sul-Africano", "Britânico", "Britânico",
                "Britânico", "Canadense", "Canadense", "Estadunidense",
                "Britânico", "Estadunidense"
        };

        double[] notas = { 7.4, 6.5, 8.8, 8.6, 9.0, 7.8, 7.9, 8.7, 8.5, 7.8 };

        int n = nomesFilmes.length;

        //adiconar às listas
        for ( int i = 0; i < n; i++) {

            Ator a = new Ator(nomesAtor[i],nascimentosAtor[i],nacAtor[i]);
            Diretor d = new Diretor(nomesDiretor[i],nascimentosDir[i],nacDir[i]);
            Filme f = new Filme(nomesFilmes[i], anos[i]);
            Avaliacao av = new Avaliacao(notas[i],f,a,d);

            listDiretores.add(d);
            listAtores.add(a);
            listFilmes.add(f);
            listAvaliacao.add(av);
        }
    }

    //Teste
    /*
    Filme filme1 = new Filme("SpiderMan", 2002);
    Ator ator1 = new Ator("Tobey Maguire", "27061975", "Estadunidense");
    Diretor diretor1 = new Diretor("Sam Raimi", "23101959", "Estadunidense");
    Avaliacao avaliacao1 = new Avaliacao(7.4, filme1, ator1, diretor1);
    */


    public List<Ator> getListAtores() {
        return listAtores;
    }

    public List<Filme> getListFilmes() {
        return listFilmes;
    }

    public List<Diretor> getListDiretores() {
        return listDiretores;
    }

    public List<Avaliacao> getListAvaliacoes() {
        return listAvaliacao;
    }
}
