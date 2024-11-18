package com.healthcare.bot.medical_appointment_api.listeners;

import com.healthcare.bot.medical_appointment_api.service.PatientService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataThermsListener {

    @Autowired
    private PatientService patientService;

    @RabbitListener(queues = "data.therms.queue")
    public void receiveDataThermsMessage(String documentIdentification) {
        System.out.println("Received data therms message: " + documentIdentification);
        if (documentIdentification != null) {
            patientService.patientAcceptsDataTreatmentPolicy(documentIdentification);
        } else {
            System.out.println("Received null or empty documentIdentification.");
        }
    }


}
