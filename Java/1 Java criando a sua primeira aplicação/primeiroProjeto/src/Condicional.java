public class Condicional {
    public static void main(String[] args) {
        int anoLanc = 1990;
        boolean inclui = false;
        double nota = 8.1;
        String tipoPlan = "plus";

        if (anoLanc >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (inclui == true && tipoPlan.equals("plus")) {
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar");
        }
    }
}
