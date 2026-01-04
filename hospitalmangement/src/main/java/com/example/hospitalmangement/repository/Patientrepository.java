package com.example.hospitalmangement.repository;

import com.example.hospitalmangement.entity.Patient;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Patientrepository extends JpaRepository<Patient, Long> {


}
