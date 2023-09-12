import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Figite seu filme favorito: ");
        String filme = scan.nextLine();

        System.out.println("Qual a data de lançamento?");
        int ano = scan.nextInt();

        System.out.println("Qual a sua nota de avaliação");
        double nota = scan.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(nota);



    }
}
