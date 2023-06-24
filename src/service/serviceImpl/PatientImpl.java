package service.serviceImpl;

import enums.Gender;
import model.DateBase;
import model.Patient;
import service.PatientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PatientImpl implements PatientService {

    private DateBase dateBase;

    public PatientImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    private long id;

    @Override
    public List<Patient> addHospital(Patient patient) {
       patient.setId(++id);
       dateBase.getPatientList().add(patient);
        return dateBase.getPatientList();
    }

    @Override
    public Patient getPatientByfirstName(String name) {
        dateBase.getPatientList()
                .stream()
                .filter(pat->pat.getFirstName().equalsIgnoreCase(name))
                .toList()
                .forEach(System.out::println);
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return dateBase.getPatientList();
    }

    @Override
    public void groupingByGender() {
        System.out.println("Sallect gender ");
        System.out.println("\nif 1 female" +
                "\nif 2 male");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1 -> {
                List<Patient>femalePatient=new ArrayList<>();
                for (Patient p: dateBase.getPatientList()) {
                    if(p.getGender()== Gender.FEMALE){
                        femalePatient.add(p);
                    }
                }
                System.out.println(femalePatient);
            }
            case 2 -> {
                List<Patient>malePatient= new ArrayList<>();
                for (Patient p: dateBase.getPatientList()) {
                    if(p.getGender()==Gender.MALE){
                        malePatient.add(p);
                    }
                }
                System.out.println(malePatient);
            }
        }
    }

    @Override
    public List<Patient> filterByAge() {
        dateBase.getPatientList()
                .stream()
                .filter(patient -> patient.getAge()>30)
                .toList().forEach(System.out::println);
        return null;
    }
}

//

//
//    @Override
//    public List<Patient> addPatient(List<Patient> patients) {
//
//        return dateBase.getPatientList();
//    }
//
//    @Override
//    public Patient getPatientByfirstName(String name) {
//
//        return null;
//    }
//
//    @Override
//    public List<Patient> getAllPatients() {
//        return dateBase.getPatientList();
//    }
//
//    @Override
//    public void groupingByGender() {
//        Map<Gender, List<Patient>> collect = dateBase.getPatientList().stream().collect(Collectors.groupingBy(Patient::getGender));
//
//    }
//
//    @Override
//    public List<Patient> filterByAge() {
//
//        return dateBase.getPatientList();
//    }
