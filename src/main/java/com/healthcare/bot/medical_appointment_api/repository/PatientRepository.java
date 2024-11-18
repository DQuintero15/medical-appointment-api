package com.healthcare.bot.medical_appointment_api.repository;

import com.healthcare.bot.medical_appointment_api.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByDocumentIdentification(String documentIdentification);
    Optional<Patient> findByPhoneNumber(String phoneNumber);
}
