import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "José Carlos";
        String tipoConta = "Corrente";
        double saldoI = 2500.00;

        System.out.println("*******************************");
        System.out.println("\nNome do cliente: "+nome);
        System.out.println("Tipo da conta: "+tipoConta);
        System.out.println("Saldo atual: "+saldoI);
        System.out.println("\n*******************************");

        int numDigitado = 0;

        String menu = """
                    \nQual operação deseja fazer
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """;

        while (numDigitado != 4){
            System.out.println(menu);
            numDigitado = scan.nextInt();

            if (numDigitado == 1){
                System.out.println("Seu saldo atual é de R$ " + saldoI);
            } else if (numDigitado == 2) {
                System.out.println("Qual valor deseja receber? ");
                double val = scan.nextDouble();

                saldoI += val;
            } else if (numDigitado == 3) {
                System.out.println("Qual valor deseja enviar? ");
                double val1 = scan.nextDouble();

                if (val1 > saldoI){
                    System.out.println("Saldo insuficiente.");
                }else {
                    saldoI -= val1;
                }
            } else if (numDigitado == 4) {
                break;
            }else {
                System.out.println("Número incorreto");
            }
        }
    }
}
