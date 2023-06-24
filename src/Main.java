import enums.Gender;
import model.DateBase;
import model.Doctor;
import model.Hospital;
import model.Patient;
import service.DoctorService;
import service.HospitalService;
import service.PatientService;
import service.serviceImpl.DoctorImpl;
import service.serviceImpl.HospitalImpl;
import service.serviceImpl.PatientImpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Hospital> hospitalList = new ArrayList<>();
        List<Doctor> doctorList = new ArrayList<>();
        List<Patient> patientList = new ArrayList<>();


        DateBase dateBase = new DateBase(hospitalList, doctorList, patientList);
        HospitalService hospitalService = new HospitalImpl(dateBase);
        DoctorService doctorService = new DoctorImpl(dateBase);
        PatientService patientService = new PatientImpl(dateBase);
        long counter = 0;
        boolean isTrue = true;
        while (isTrue) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    1 . to add new hospital
                    2 . to add new hospitalS
                    3 . get all hospitals
                    4 . get hospital by id
                    5 . update hospital 
                    6 . sort hospital by name 
                    7 . add doctor
                    8 . get doctor by id
                    9 . get all doctors
                    10 . filter be doctor gender 
                    11 . add new patient
                    12 . get patient by first name
                    13 . get all patients 
                    14 . groupint patients by gender
                    15 . filter by patient age 
                    0 . exit 
                    """);
            int num = scanner.nextInt();

            switch (num) {
                case 1 -> {
                    boolean hospy = true;
                    try {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("enter a name :");
                        String name = scanner1.nextLine();
                        System.out.println("enter a address : ");
                        String address = scanner1.nextLine();
                        Hospital hospital = new Hospital();
                        hospital.setId(++counter);
                        hospital.setName(name);
                        hospital.setAddress(address);
                        System.out.println(hospitalService.addHospital(hospital));
                    }catch(InputMismatchException e){
                        System.out.println("Please input right");
                    }
                }

                case 3 -> System.out.println(hospitalService.getAllHospitals());
                case 4 -> {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("enter a hospital id : ");
                    long id = scanner1.nextLong();
                    System.out.println(hospitalService.getHospitalById(id));
                }
                case 5 -> {
                    Hospital hospital = new Hospital();
                    Scanner fifa = new Scanner(System.in);
                    System.out.println("enter a id by hospital : ");
                    long id = fifa.nextLong();
                    System.out.println("enter a new name : ");
                    String newName = new Scanner(System.in).nextLine();
                    System.out.println("enter a address : ");
                    String address = new Scanner(System.in).nextLine();

                    hospital.setName(newName);
                    hospital.setAddress(address);
                    hospitalService.updateHospital(id,hospital);
                }
                case 6 -> hospitalService.sortHospitalByName(" . ");
                case 7 -> {
                    Doctor doctor = new Doctor();
                    boolean isBoo = true;
                    while (isBoo) {
//                        counter++;
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("enter a doctor name : ");
                        String name = scanner1.nextLine();
                        System.out.println("enter a last name of doctor : ");
                        String lastName = scanner1.nextLine();
                        System.out.println("enter a email : ");
                        String email = scanner1.nextLine();
                        System.out.println("enter a gender : ");
                        String gender = scanner1.nextLine();
                        if (gender.equalsIgnoreCase("male")) {
                            doctor.setGender(Gender.MALE);
                        } else if (gender.equalsIgnoreCase("female")) {
                            doctor.setGender(Gender.FEMALE);
                        }
                        doctor.setFirstName(name);
                        doctor.setLastName(lastName);
                        doctor.setEmail(email);
                        System.out.println(doctorService.addDoctor(doctor));
                        isBoo=false;
                    }
                }
                case 8 -> {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("enter a id of doctor : ");
                    long id = scanner1.nextLong();
                    dateBase.getDoctorList().stream().filter(doctor -> doctor.getId() == id).toList().forEach(System.out::println);
                }
                case 9 -> System.out.println(doctorService.getAllDoctors());
                case 10 -> {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("filter by gender : ");
                    String gender= scanner1.nextLine();
                    System.out.println(doctorService.filterByGender(gender));}
                case 11 -> {
                    Scanner scanner1 = new Scanner(System.in);
                    Patient patient = new Patient();
                    System.out.println("enter a name of patient : ");
                    String name = scanner1.nextLine();
                    System.out.println("enter a last name of patient : ");
                    String lastName= scanner1.nextLine();
                    System.out.println("enter a phone number  : ");
                    String phoneNumber= scanner1.nextLine();
                    System.out.println("enter a gender : ");
                    String gender = scanner1.nextLine();
                    if (gender.equalsIgnoreCase("male")) {
                        patient.setGender(Gender.MALE);
                    } else if (gender.equalsIgnoreCase("female")) {
                        patient.setGender(Gender.FEMALE);
                    }
                    System.out.println("enter a age : ");
                    int age = scanner1.nextInt();
                    patient.setFirstName(name);
                    patient.setLastName(lastName);
                    patient.setPhoenNumber(phoneNumber);
                    patient.setAge(age);
                    System.out.println(patientService.addHospital(patient));}
                case 12 ->{
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("enter a name of patient : ");
                    String name = scanner1.nextLine();
                    patientService.getPatientByfirstName(name);}
                case 13 -> System.out.println(patientService.getAllPatients());
                case 14 -> patientService.groupingByGender();
                case 15 -> System.out.println(patientService.filterByAge());
                case 0 -> isTrue = false;
            }
        }
    }
}