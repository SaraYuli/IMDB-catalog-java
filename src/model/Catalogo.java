package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
    private final List<ItemCatalogo> itensCatalogo;
    private final Scanner scanner;

    public Catalogo() {
        this.itensCatalogo = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    //--- MENU ---
    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("---Menu---");
            System.out.println("1. Cadastrar item: ");
            System.out.println("2. Listar itens: ");
            System.out.println("3. Buscar itens: ");
            System.out.println("Escolha sua Opção:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarItemCatalogo();
                    break;
                case 2:
                    listarItens();
                    break;
                case 3:
                    buscarItem();
                    break;
                case 0:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    //--- ADD ITEM ---
    public void cadastrarItemCatalogo() {
        System.out.println("---Informe os dados do novo item---");
        System.out.println("Digite o título: ");
        String titulo = scanner.nextLine();
        String diretor = scanner.nextLine();
        String ator = scanner.nextLine();
        String genero = scanner.nextLine();
        String duracao = scanner.nextLine();
        ItemCatalogo Filme = new Filme(titulo, diretor, ator, genero, duracao);
        adicionarItemCatalogo(Filme);
        System.out.println("Item cadastrado com sucesso!\n");
    }

    public void adicionarItemCatalogo(ItemCatalogo itemCatalogo) {
        this.itensCatalogo.add(itemCatalogo);
    }

    //--- LISTAR ITEM ---
    public void listarItens() {
        for (int i = 0; i < itensCatalogo.size(); i++) {
            System.out.println("Item: " + (i+1));
            this.itensCatalogo.get(i).exibirDetalhes();
        }
    }

    //--- BUSCAR ITEM ---
    public void buscarItem() {
        System.out.println("---Informe o Título do item---");
        System.out.println("Digite o título: ");
        String titulo = scanner.nextLine();
        ItemCatalogo itemRetornado = buscarItemPorTitulo(titulo);
        if (itemRetornado != null){
            itemRetornado.exibirDetalhes();
        }
    }

    public ItemCatalogo buscarItemPorTitulo(String titulo) {
        for (ItemCatalogo item : this.itensCatalogo) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Encontrei o item: ");
                return item;
            }
        }
        System.out.println("Item não localizado");
        return null;
    }
}
