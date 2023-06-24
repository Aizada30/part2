package model;

import java.util.List;

public class DateBase {

   private List<Hospital>hospitalList;
   private List<Doctor>doctorList;
   private List<Patient> patientList;

    public DateBase(List<Hospital> hospitalList, List<Doctor> doctorList, List<Patient> patientList) {
        this.hospitalList = hospitalList;
        this.doctorList = doctorList;
        this.patientList = patientList;
    }

    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
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
        return "DateBase{" +
                "hospitalList=" + hospitalList +
                ", doctorList=" + doctorList +
                ", patientList=" + patientList +
                '}';
    }
}
