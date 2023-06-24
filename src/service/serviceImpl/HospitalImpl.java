package service.serviceImpl;

import model.DateBase;
import model.Hospital;
import service.HospitalService;

import java.util.Comparator;
import java.util.List;

public class HospitalImpl implements HospitalService {

    private DateBase dateBase;

    public HospitalImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public List<Hospital> addHospital(Hospital hospital) {
        dateBase.getHospitalList().add(hospital);
        return dateBase.getHospitalList();
    }

    @Override
    public List<Hospital> addHospitals(List<Hospital> hospitals) {
        dateBase.getHospitalList().addAll(hospitals);
        return dateBase.getHospitalList();
    }

    @Override
    public Hospital getHospitalById(Long id) {
        for (int i = 0; i < dateBase.getHospitalList().size(); i++) {
            if (dateBase.getHospitalList().get(i).getId() == (id)) {
                System.out.println(dateBase.getHospitalList().get(i));
            }

        }
        return null;
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return dateBase.getHospitalList();
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {
        for (int i = 0; i <dateBase.getHospitalList().size(); i++) {
            if(dateBase.getHospitalList().get(i).getId()==id){
                dateBase.getHospitalList().get(i).setName(hospital.getName());
                dateBase.getHospitalList().get(i).setAddress(hospital.getAddress());
                System.out.println(dateBase.getHospitalList().get(i));
            }
        }
    }

    @Override
    public List<Hospital> sortHospitalByName(String sort) {
        dateBase.getHospitalList().sort(sortName);
        return null;
    }
    Comparator<Hospital> sortName = new Comparator<Hospital>() {
        @Override
        public int compare(Hospital o1, Hospital o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}