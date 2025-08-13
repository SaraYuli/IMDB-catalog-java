package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Pessoa {

    public static int contadorId = 0;
    private int idPessoa;

    private String nomePessoa;
    // Data de nascimento sendo usada no padrão ddMMYYYY
    private String dataNascimento;
    private String nacionalidade;

    public Pessoa(String nomePessoa, String dataNascimento, String nacionalidade) {
        this.nomePessoa = nomePessoa;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;

    }

    public int getIdPessoa() {
        return this.idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        if (!dataNascimento.matches("\\d{8}")) {
            System.out.println("Por favor insira uma data válida");

        } else {
            this.dataNascimento = dataNascimento;
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void exibirInfoPessoas() {
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Data de Nascimento: " + exibirDataNascimentoFormatada());
        System.out.println("Nacionalidade: " + this.nacionalidade + "\n");
    }

    public String exibirDataNascimentoFormatada() {
        try {
            SimpleDateFormat formatoEntrada = new SimpleDateFormat("ddMMyyyy");
            SimpleDateFormat formatoSaida = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formatoSaida.format(formatoEntrada.parse(this.dataNascimento));

            return dataFormatada;

        } catch (ParseException e) {
            System.out.println("Data de nascimento inválida.");

            return "";
        }
    }

}
