package repository;

import entity.Patient;

import java.util.ArrayList;

public class PatientRepository {
    private int lasIdAdd;
    private ArrayList<Patient> patients;

    public PatientRepository(){
        patients = new ArrayList<Patient>();
        lasIdAdd = 0;
    }

    public Patient insertPatient(Patient item){
        lasIdAdd +=1;
        item.setIdPeople(lasIdAdd);
        patients.add(item);

        return item;
    }

    public Patient searchById(int id){
        Patient item = null;

        for (Patient patient: patients) {
            if(patient.getIdPeople() == id){
                item = patient;
                break;
            }
        }
        return item;
    }

    public ArrayList<Patient> searchAllPatient(){
        return new ArrayList<>(patients)
    }

    public Patient searchByName(String name){
        Patient wanted = null;

        for (Patient patient: patients){
            if (patient.getName().toLowerCase().equals(name.toLowerCase())){
                wanted =patient;
                break;
            }
        }
        return wanted;
    }

    public Patient searchByCPF(String cpf){
        Patient wanted = null;

        for (Patient patient: patients) {
            if(patient.getCpf().equals(cpf)){
                wanted = patient;
                break;
            }
        }
        return wanted;
    }

    public boolean deleteById(int id){
        Patient item = searchById(id);

        if (item == null){
            return false;
        }else {
            patients.remove(item);
            return true;
        }
    }


}
