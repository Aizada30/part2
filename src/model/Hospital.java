package model;

import java.util.List;

public class Hospital {

    private long id;
    private String name;
    private String address;
    private List<Doctor> doctorList;
    private List<Patient>patientList;

    public Hospital(){

    }

    public Hospital(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Hospital(long id, String name, String address, List<Doctor> doctorList, List<Patient> patientList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.doctorList = doctorList;
        this.patientList = patientList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public String toString() {
        return "\n" +
                "\n     Hospital : " +
                "\n     ID : " + id +
                "\nNAME : " + name +
                "\nADDRESS : " + address +
                "\n     DOCTORS : " + doctorList +
                "\n     PATIENTS : " + patientList+"\n"
                ;
    }
}
