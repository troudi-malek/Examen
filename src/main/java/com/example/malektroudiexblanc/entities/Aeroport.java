package com.example.malektroudiexblanc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name="aeroport")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAeroport;
    private String nom;
    private String codeAITA;
    private long telephone;
//ddddddd


}
