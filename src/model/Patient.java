package model;

import enums.Gender;

public class Patient {
    private long id;
    private String firstName;
    private String lastName;
    private String phoenNumber;
    private Gender gender;
    private int age;

    public Patient (){

    }

    public Patient(long id, String firstName, String lastName, String phoenNumber, Gender gender, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoenNumber = phoenNumber;
        this.gender = gender;
        this.age = age;
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

    public String getPhoenNumber() {
        return phoenNumber;
    }

    public void setPhoenNumber(String phoenNumber) {
        this.phoenNumber = phoenNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" +
                "\n~     Patient : " +
                "\n     ID : " + id +
                "\nFIRST NAME : " + firstName +
                "\nLAST NAME : " + lastName +
                "\nPHONE NUMBER : " + phoenNumber +
                "\nGENDER : " + gender +
                "\nAGE : " + age+"\n" ;
    }
}
