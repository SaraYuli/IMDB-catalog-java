package model;

public class Main {
    public static void main(String[] args) {
        Filme itemFilme = new Filme(
                "O Predestinado");
        Catalogo Catalogo = new Catalogo();
        Catalogo.adicionarItensCatalogo(itemFilme);
        Catalogo.exibirMenu();
    }
}