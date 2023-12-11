package com.example.malektroudiexblanc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="voyageur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVoyageur;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "voyageur")
    private Set<Reservation> reservations;
}
