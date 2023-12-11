package com.example.malektroudiexblanc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="vol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVol;
    private LocalDate dateDepart;
    private LocalDate dateArrive;
    @ManyToOne
    private Aeroport aeroport;
    @ManyToOne
    private Aeroport aeroport2;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "vols")
    private Set<Reservation> reservations;
}
