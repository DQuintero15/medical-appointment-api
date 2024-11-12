package com.healthcare.bot.medical_appointment_api.service;

import com.healthcare.bot.medical_appointment_api.entity.Doctor;
import com.healthcare.bot.medical_appointment_api.entity.DoctorSpeciality;
import com.healthcare.bot.medical_appointment_api.entity.Speciality;
import com.healthcare.bot.medical_appointment_api.repository.DoctorRepository;
import com.healthcare.bot.medical_appointment_api.repository.SpecialityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private static final Logger log = LoggerFactory.getLogger(DoctorService.class);

    @Autowired
    private DoctorRepository doctorRepository;
    private SpecialityRepository specialityRepository;
    private DoctorSpecialityService doctorSpecialityService;

}
