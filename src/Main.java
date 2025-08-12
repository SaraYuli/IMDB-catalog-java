import infra.CarregarDados;

public class Main {


    public static void main(String[] args) {

    //Carregar dados prévios
    CarregarDados carregarDados = new CarregarDados();

        System.out.println(carregarDados.getListFilmes().get(0).getNomeFilme());

    }
}
