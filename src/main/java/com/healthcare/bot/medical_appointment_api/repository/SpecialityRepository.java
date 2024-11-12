package com.healthcare.bot.medical_appointment_api.repository;

import com.healthcare.bot.medical_appointment_api.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
