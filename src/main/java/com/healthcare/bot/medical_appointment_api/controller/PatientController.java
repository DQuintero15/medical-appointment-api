package com.healthcare.bot.medical_appointment_api.controller;

import com.healthcare.bot.medical_appointment_api.entity.Patient;
import com.healthcare.bot.medical_appointment_api.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/{documentIdentification}")
    public ResponseEntity<Patient> getPatientByDocumentIdentification(@PathVariable String documentIdentification) {
        Patient patient = patientService.getPatientByDocumentIdentification(documentIdentification);
        if (patient == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }
}
