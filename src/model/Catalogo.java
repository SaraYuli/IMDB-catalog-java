package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
    private final List<ItensCatalogo> itensCatalogo;
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
            System.out.println("Escolha sua Opção:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarItensCatalogo();
                    break;
                case 2:
                    listarItens();
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
    public void cadastrarItensCatalogo() {
        System.out.println("---Informe os dados do novo item---");
        System.out.println("Digite o título: ");
        String titulo = scanner.nextLine();
        ItensCatalogo Filme = new Filme(titulo);
        adicionarItensCatalogo(Filme);
        System.out.println("Item cadastrado com sucesso!\n");
    }

    public void adicionarItensCatalogo(ItensCatalogo itensCatalogo) {
        this.itensCatalogo.add(itensCatalogo);
    }

    //--- LISTAR ITEM ---
    public void listarItens() {
        for (int i = 0; i < itensCatalogo.size(); i++) {
            System.out.println("Item: " + (i+1));
            this.itensCatalogo.get(i).exibirDetalhes();
        }
    }
}
