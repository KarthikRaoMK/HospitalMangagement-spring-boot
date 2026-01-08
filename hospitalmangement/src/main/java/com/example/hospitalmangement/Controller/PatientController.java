package com.example.hospitalmangement.Controller;

import com.example.hospitalmangement.entity.Patient;
import com.example.hospitalmangement.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService service;

    // Constructor Injection
    public PatientController(PatientService service) {
        this.service = service;
    }

    // CREATE API
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    // READ API
    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }
}
