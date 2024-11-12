package com.healthcare.bot.medical_appointment_api.repository;

import com.healthcare.bot.medical_appointment_api.entity.DoctorSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorSpecialityRepository extends JpaRepository<DoctorSpeciality, Long> {
}
