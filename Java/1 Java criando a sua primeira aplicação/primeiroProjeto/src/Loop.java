import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int total = 0;

        while (nota != -1){
            System.out.println("Diga sua avaliação para o filme ou digite -1 para parar");
            nota = scan.nextDouble();

            if (nota != -1){
                media += nota;
                total ++;
            }
        }

        System.out.println("Média de avaliação: " + media/3);
    }
}
