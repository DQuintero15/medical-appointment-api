package com.healthcare.bot.medical_appointment_api.service;

import com.healthcare.bot.medical_appointment_api.entity.Speciality;
import com.healthcare.bot.medical_appointment_api.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityService {

    @Autowired
    private SpecialityRepository specialityRepository;

    public List<Speciality> getAllSpecialities() {
        return specialityRepository.findAll();
    }

}
