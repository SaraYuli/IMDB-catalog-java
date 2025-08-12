package model;

public abstract class Pessoa {

    private int id;

    private String nome;
    // Data de nascimento sendo usada no padrão ddMMYYYY
    private String dataNascimento;
    private String nacionalidade;

    public Pessoa(String nome, String dataNascimento, String nacionalidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.id += 1;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (!dataNascimento.matches("\\d{8}")) {
            System.out.println("Por favor insira uma data válida");

        } else {
            this.dataNascimento = dataNascimento.replaceAll("\\D+", "");
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void exibirInformacoesBasicas() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Nacionalidade: " + this.nacionalidade + "\n");
     }
}
