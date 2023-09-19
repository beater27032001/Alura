package entity;

public class Patient extends People{
    private Area situation;
    private String coment;

    public Patient(String name, String cpf, int idPeople, String email, int number) {
        super(name, cpf, idPeople, email, number);
    }

    public Patient(String name, String cpf, int idPeople, String email, int number, String coment) {
        super(name, cpf, idPeople, email, number);
        this.coment = coment;
    }

    public Patient(String name, String cpf, int idPeople, String email, int number, Area situation, String coment) {
        super(name, cpf, idPeople, email, number);
        this.situation = situation;
        this.coment = coment;
    }

    public Patient() {
    }

    public Area getSituation() {
        return situation;
    }

    public void setSituation(Area situation) {
        this.situation = situation;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "situation=" + situation +
                ", coment='" + coment + '\'' +
                '}';
    }
}
