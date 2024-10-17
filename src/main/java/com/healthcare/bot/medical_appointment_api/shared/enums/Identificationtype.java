package com.healthcare.bot.medical_appointment_api.shared.enums;


public enum Identificationtype {
    CC("Cédula de ciudadanía"),
    CE("Cédula de extranjería"),
    TI("Tarjeta de identidad"),
    RC("Registro civil"),
    PA("Pasaporte");

    private final String description;

    Identificationtype(String description) {
        this.description = description;
    }
}
