package entity;

public class Doctor extends People{
    private String crm;
    private Area area;

    public Doctor(String name, String cpf, int idPeople, String email, int number, String crm, Area area) {
        super(name, cpf, idPeople, email, number);
        this.crm = crm;
        this.area = area;
    }

    public String getCrm() {
        return crm;
    }

    public Area getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "crm='" + crm + '\'' +
                ", area=" + area +
                '}';
    }
}
