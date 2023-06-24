package model;

import enums.Gender;

import java.util.List;

public class Doctor {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private List<Patient> patientList;

    public Doctor(){

    }

    public Doctor(long id, String firstName, String lastName, String email, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Doctor(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Doctor(long id, String firstName, String lastName, String email, Gender gender, List<Patient> patientList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.patientList = patientList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
                "\n~     Doctor : " +
                "\n     ID : " + id +
                "\nFIRST NAME : " + firstName +
                "\nLAST NAME : " + lastName +
                "\nEMAIL : " + email +
                "\nGENDER : " + gender +
                "\n~     PATIENTS : " + patientList+"\n"
                ;
    }
}
