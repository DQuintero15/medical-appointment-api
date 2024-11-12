package com.healthcare.bot.medical_appointment_api.controller;

import com.healthcare.bot.medical_appointment_api.entity.Service;
import com.healthcare.bot.medical_appointment_api.service.MedicalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medical-services")
public class MedicalServiceController {
    @Autowired
    private MedicalServiceService medicalServiceService;

    @GetMapping
    public ResponseEntity<List<Service>> getAllMedicalServices() {
        return ResponseEntity.ok(medicalServiceService.getAllMedicalServices());
    }
}
