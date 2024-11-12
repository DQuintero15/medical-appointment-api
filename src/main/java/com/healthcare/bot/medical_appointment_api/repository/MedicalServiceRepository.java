package com.healthcare.bot.medical_appointment_api.repository;

import com.healthcare.bot.medical_appointment_api.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalServiceRepository extends JpaRepository<Service, Long> {
}
