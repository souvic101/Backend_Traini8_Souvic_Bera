package com.example.traini8.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    private String detailedAdd;
    private String city;
    private  String state;
    private String pincode;
}
