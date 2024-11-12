package com.healthcare.bot.medical_appointment_api.service;

import com.healthcare.bot.medical_appointment_api.entity.Patient;
import com.healthcare.bot.medical_appointment_api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient getPatientByDocumentIdentification(String documentIdentification) {
        return patientRepository.findByDocumentIdentification(documentIdentification).orElse(null);
    }

    public void patientAcceptsDataTreatmentPolicy(String documentIdentification) {
        Patient patient = patientRepository.findByDocumentIdentification(documentIdentification).orElse(null);
        if (patient != null && !patient.isConfirmDataPolicy()) {
            patient.setConfirmDataPolicy(true);
            patient.setConfirmTermsConditionsDate(LocalDate.now());
            patientRepository.save(patient);
        }
    }

    public boolean isPatientDataPolicyConfirmed(String phoneNumber) {
        Patient patient = patientRepository.findByPhoneNumber(phoneNumber).orElse(null);
        return patient != null && patient.isConfirmDataPolicy();
    }

}
