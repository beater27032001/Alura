package entity;

public class People {
    private String name;
    private String cpf;
    private int idPeople;
    private String email;
    private int number;

    public People(String name, String cpf, int idPeople, String email, int number) {
        this.name = name;
        this.cpf = cpf;
        this.idPeople = idPeople;
        this.email = email;
        this.number = number;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdPeople() {
        return idPeople;
    }

    public void setIdPeople(int idPeople) {
        this.idPeople = idPeople;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idPeople=" + idPeople +
                ", email='" + email + '\'' +
                ", number=" + number +
                '}';
    }
}
