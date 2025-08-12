import model.Ator;
import model.Avaliacao;
import model.Diretor;
import model.Filme;

public class Main {

    public static void main(String[] args) {

        //Teste
        Filme filme1 = new Filme("SpiderMan",2002);
        Ator ator1 = new Ator("Tobey Maguire","27061975","Estadunidense");
        Diretor diretor1 =  new Diretor("Sam Raimi","23101959","Estadunidense");
        Avaliacao  avaliacao1 = new Avaliacao(7.4,filme1,ator1,diretor1);

        ator1.exibirInformacoesBasicas();
        diretor1.exibirInformacoesBasicas();
    }
}
