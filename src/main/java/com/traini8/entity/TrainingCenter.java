package com.traini8.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

@Entity
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    private String centerCode;

    @Embedded
    private Address address;

    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private long createdOn = Instant.now().getEpochSecond();

    @Email
    private String contactEmail;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$")
    private String contactPhone;
}
