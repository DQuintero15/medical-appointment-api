package com.healthcare.bot.medical_appointment_api.service;

import com.healthcare.bot.medical_appointment_api.repository.MedicalServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServiceService {

    @Autowired
    private MedicalServiceRepository medicalServiceRepository;

    public List<com.healthcare.bot.medical_appointment_api.entity.Service> getAllMedicalServices() {
        return medicalServiceRepository.findAll();
    }
}
