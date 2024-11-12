package com.healthcare.bot.medical_appointment_api.service;

import com.healthcare.bot.medical_appointment_api.entity.Patient;
import com.healthcare.bot.medical_appointment_api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient getPatientByDocumentIdentification(String documentIdentification) {
        return patientRepository.findByDocumentIdentification(documentIdentification).orElse(null);
    }
}
