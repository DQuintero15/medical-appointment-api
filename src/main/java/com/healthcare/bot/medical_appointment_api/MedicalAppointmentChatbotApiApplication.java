package com.healthcare.bot.medical_appointment_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MedicalAppointmentChatbotApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalAppointmentChatbotApiApplication.class, args);
	}

}
