package com.example.hospitalmangement.service;


import com.example.hospitalmangement.entity.Patient;
import com.example.hospitalmangement.repository.Patientrepository;
import java.util.List;

public class PatientService {
    private final Patientrepository repository;

    public PatientService(Patientrepository repository) {
        this.repository = repository;
    }
    //CREAT
    public Patient savePatient(Patient patient){
        return repository.save(patient);
    }
    //READ
    public List<Patient> getAllPatients(){
        return repository.findAll();
    }


}
