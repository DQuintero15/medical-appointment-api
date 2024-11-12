package com.healthcare.bot.medical_appointment_api.repository;

import com.healthcare.bot.medical_appointment_api.entity.Doctor;
import com.healthcare.bot.medical_appointment_api.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
