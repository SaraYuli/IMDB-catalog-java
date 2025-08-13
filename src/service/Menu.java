package service;

import model.Ator;
import model.Avaliacao;
import model.Diretor;
import model.Filme;

import java.util.Scanner;

public class Menu {

    private int opcaoMenu = 0;
    private final Scanner scanner;
    private final Catalogo catalogo;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.catalogo = new Catalogo();
    }

    public void invocarMenu() {
        exibirMenu();
    }

    public void exibirMenu() {

        do {

            System.out.println("1. Cadastrar Filme");
            System.out.println("2. Cadastrar Diretor");
            System.out.println("3. Cadastrar Ator");
            //System.out.println("4. Cadastrar Avaliação");
            System.out.println("5. Listar Filmes");
            System.out.println("6. Listar Diretores");
            System.out.println("7. Listar Atores");
            System.out.println("8. Listar Avaliações");
            System.out.println("9. Sair");

            System.out.print("Escolha uma opção: ");
            opcaoMenu = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcaoMenu) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    cadastrarDiretor();
                    break;
                case 3:
                    cadastrarAtor();
                    break;
//                case 4:
//                    cadastrarAvaliacao();
//                    break;
                case 5:
                    listarFilmes();
                    break;
                case 6:
                    listarDiretores();
                    break;
                case 7:
                    listarAtores();
                    break;
                case 8:
                    listarAvaliacoes();
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    fecharMenu();
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        } while (opcaoMenu != 9);

    }

    private void cadastrarFilme() {
        System.out.println("Cadastro de Filme selecionado");
        System.out.print("Digite o nome do filme: ");
        String nomeFilme = scanner.nextLine();
        System.out.print("Digite o ano de lançamento: ");
        int anoLancamento = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a sinopse do filme: ");
        String sinopse = scanner.nextLine();
        Filme filme = new Filme(nomeFilme, anoLancamento);
        filme.setSinopse(sinopse);
        
        catalogo.getFilmesCatalogo().add(filme);
    }

    private void cadastrarDiretor() {
        System.out.println("Cadastro de Diretor selecionado");
        System.out.print("Digite o nome do diretor: ");
        String nomeDiretor = scanner.nextLine();
        System.out.print("Digite a data de nascimento (ddMMyyyy): ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Digite a nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        Diretor diretor = new Diretor(nomeDiretor, dataNascimento, nacionalidade);
        
        catalogo.getDiretoresCatalogo().add(diretor);
    }

    private void cadastrarAtor() {
        System.out.println("Cadastro de Ator selecionado");
        System.out.print("Digite o nome do ator: ");
        String nomeAtor = scanner.nextLine();
        System.out.print("Digite a data de nascimento (ddMMyyyy): ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Digite a nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        Ator ator = new Ator(nomeAtor, dataNascimento, nacionalidade);
        
        catalogo.getAtoresCatalogo().add(ator);
    }

    private void cadastrarAvaliacao() {
        System.out.println("Cadastro de Avaliação selecionado");
        System.out.print("Digite a nota (0-10): ");
        double nota = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o comentário: ");
        String comentario = scanner.nextLine();
        Avaliacao avaliacao = new Avaliacao(nota, null, null, null); // Não implementar agora, avaliação precisa ter um filme, ator e diretor antes. Null só para não quebrar o contrutor, por hora.
        catalogo.getAvaliacoesCatalogo().add(avaliacao);
    }

    private void listarFilmes() {
        System.out.println("Listagem de Filmes selecionada");
        for (Filme filme : catalogo.getFilmesCatalogo()) {
            System.out.println("Nome: " + filme.getNomeFilme());
            System.out.println("Ano: " + filme.getAnoLancamento());
            System.out.println("Sinopse: " + filme.getSinopse());
            System.out.println("--------------------");
        }
    }

    private void listarDiretores() {
        System.out.println("Listagem de Diretores selecionada");
        for (Diretor diretor : catalogo.getDiretoresCatalogo()) {
            diretor.exibirInfoPessoas();
        }
    }

    private void listarAtores() {
        System.out.println("Listagem de Atores selecionada");
        for (Ator ator : catalogo.getAtoresCatalogo()) {
            ator.exibirInfoPessoas();
        }
    }

    private void listarAvaliacoes() {
        System.out.println("Listagem de Avaliações selecionada");
        for (Avaliacao avaliacao : catalogo.getAvaliacoesCatalogo()) {
            System.out.println("Nota: " + avaliacao.getNota());
            System.out.println("Comentário: " + avaliacao.getComentario());
            System.out.println("--------------------");
        }
    }

    private void fecharMenu() {
        scanner.close();
    }
}
