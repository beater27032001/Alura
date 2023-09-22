import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private String nome;
    private String intrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String nome, String intrutor) {
        this.nome = nome;
        this.intrutor = intrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getIntrutor() {
        return intrutor;
    }

    public String getNome() {
        return nome;
    }

    public void adicionar(Aula aula){
        this.aulas.add(aula);
    }
}
