package com.healthcare.bot.medical_appointment_api.entity;

import com.healthcare.bot.medical_appointment_api.shared.enums.Identificationtype;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "patients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;


    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "document_idenfication", nullable = false, unique = true)
    private String documentIdentification;

    @Enumerated(EnumType.STRING)
    @Column(name = "identification_type", nullable = false)
    private Identificationtype identificationType;

    @Column(name = "confirm_data_policy", nullable = false)
    private boolean confirmDataPolicy;

    @Column(name = "confirm_terms_conditions_date")
    private LocalDate confirmTermsConditionsDate;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
