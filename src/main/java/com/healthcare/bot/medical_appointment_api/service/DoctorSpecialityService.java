package com.healthcare.bot.medical_appointment_api.service;

import com.healthcare.bot.medical_appointment_api.entity.DoctorSpeciality;
import com.healthcare.bot.medical_appointment_api.repository.DoctorSpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorSpecialityService {
    @Autowired
    private DoctorSpecialityRepository doctorSpecialityRepository;

    public List<DoctorSpeciality> findAll() {
        return doctorSpecialityRepository.findAll();
    }
}
