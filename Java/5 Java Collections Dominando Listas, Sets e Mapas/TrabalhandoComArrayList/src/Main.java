import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String a1 = "Conhecendo...";
        String a2 = "Modelando...";
        String a3 = "Trabalhando...";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraA = aulas.get(0);
        System.out.println(primeiraA);

        for (int i = 0; i < aulas.size(); i++){
            System.out.println("aula: " + aulas.get(i));
        }

        System.out.println(aulas.size());

        aulas.forEach(aula -> {System.out.println("percorrendo: " + aula);});

        aulas.add("Aumentando...");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);
    }
}