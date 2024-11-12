package com.healthcare.bot.medical_appointment_api.controller;

import com.healthcare.bot.medical_appointment_api.entity.Speciality;
import com.healthcare.bot.medical_appointment_api.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/specialities")
public class SpecialityController {

    @Autowired
    private SpecialityService specialityService;

    @GetMapping
    public List<Speciality> getAllSpecialities() {
        return specialityService.getAllSpecialities();
    }
}
