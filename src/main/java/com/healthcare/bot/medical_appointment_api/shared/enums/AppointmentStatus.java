package com.healthcare.bot.medical_appointment_api.shared.enums;

public enum AppointmentStatus {
    SCHEDULED("Agendado"),
    CANCELED("Cancelado"),
    PENDING("Pendiente"),
    COMPLETED("Completado");

    private final String description;

    AppointmentStatus(String description) {
        this.description = description;
    }
}
