package service.serviceImpl;

import enums.Gender;
import model.DateBase;
import model.Doctor;
import service.DoctorService;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoctorImpl implements DoctorService<Doctor> {
    private DateBase dateBase;

    public DoctorImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }
    private static long id;

    @Override
    public List<Doctor> addDoctor(Doctor doctor) {
        doctor.setId(++id);
        dateBase.getDoctorList().add(doctor);
        return dateBase.getDoctorList();
    }

    @Override
    public Doctor getDoctorById(Long id) {
        dateBase.getDoctorList().stream().filter(doc->doc.getId()==id).toList().forEach(System.out::println);
        return null;
    }

    @Override
    public List<Doctor> filterByGender(String gender) {
        Consumer<Doctor> doctorList = System.out::println;
        if(gender.equalsIgnoreCase("FEMALE")){
        dateBase.getDoctorList().stream().filter(doctor -> doctor.getGender()==Gender.FEMALE).toList().forEach(doctorList);
            System.out.println(doctorList);}
        else if (gender.equalsIgnoreCase("MALE")) {
            dateBase.getDoctorList().stream().filter(doctor -> doctor.getGender()==Gender.MALE).toList().forEach(System.out::println);
            System.out.println(doctorList);
        }
        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return dateBase.getDoctorList();
    }
}

