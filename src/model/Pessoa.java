package model;

public abstract class Pessoa {
    private String nome;
    private int dataNascimento;
    private String nacionalidade;

    public Pessoa(String nome, int dataNascimento, String nacionalidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;

    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
     public void exibirInformacoesBasicas(){
         System.out.println("Nome: " + this.nome);
         System.out.println("Data de Nascimento: " + this.dataNascimento);
         System.out.println("Nacionalidade: " + this.nacionalidade);
     }
}
