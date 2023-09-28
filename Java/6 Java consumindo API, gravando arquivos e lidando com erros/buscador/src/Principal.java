import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        ConsultaCep consulta = new ConsultaCep();

        System.out.println("Digite um CEP: ");
        var cep = leitura.nextLine();

        try {
            Endereco novoEnd = consulta.buscaEnd(cep);
            System.out.println(novoEnd);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEnd);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando...");
        }


    }
}
