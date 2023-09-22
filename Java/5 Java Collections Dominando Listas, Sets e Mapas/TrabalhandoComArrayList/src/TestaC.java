import java.util.List;

public class TestaC {
    public static void main(String[] args) {
        Curso jC = new Curso("Dominando...", "José");

        jC.adicionar(new Aula("Trabalhando...", 21));
        jC.adicionar(new Aula("Criando...", 20));
        jC.adicionar(new Aula("Modelando...", 22));

        List<Aula> aulas = jC.getAulas();

        System.out.println(jC.getAulas());

        Aula[] array;

    }
}
