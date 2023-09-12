    import java.util.Random;
    import java.util.Scanner;

    public class JogoAdivinhacao {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int numGerado = new Random().nextInt(100);
            int tentativas = 0;

            while (tentativas < 5){
                System.out.println("Digite um número entre 0 e 100: ");
                int numDigitado = scan.nextInt();
                tentativas++;

                if (numDigitado == numGerado){
                    System.out.println("Parabéns, você acertou o número!");
                    break;
                } else if (numDigitado > numGerado) {
                    System.out.println("O número digitado é maior que o número gerado.");
                }else {
                    System.out.println("O número digitado é menor que o número gerado.");
                }
            }
            if (tentativas == 5){
                System.out.println("Você não acertou!");
            }
        }
    }
