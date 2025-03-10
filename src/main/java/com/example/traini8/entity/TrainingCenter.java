package com.example.traini8.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

@Entity(name="traini8")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false, length = 40)
    @Size (max = 40, message = "Center name must be less than 40 characters")
    @NotBlank (message = "Center name is required")
    private String centerName;
    private String centerCode;
    @Embedded
    private Adress  address;
    private int capacity;
    private List<String> courseOfrd;
    private Instant createdOn;
    @Email(message = "Invalid email format..!!")
    private String contactEmail;
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number..!!")
    private String contactPhone;

    @PrePersist
    public void prePersist() {
        this.createdOn = Instant.now();
    }



}
