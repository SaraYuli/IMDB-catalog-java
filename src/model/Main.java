package model;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        Filme itemFilme = new Filme(
                "Predestination",
                "Michael Spierig & Peter Spierig",
                "Ethan Hawke, Sarah Snook, Noah Taylor",
                "Fição Científica, Viagem no tempo, Suspense",
                "1h44");
        Catalogo Catalogo = new Catalogo();
        Catalogo.adicionarItemCatalogo(itemFilme);
        Catalogo.exibirMenu();
    }
}