package com.example.malektroudiexblanc.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="Reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
    private String idReservation;
    private LocalDate dateReservation;
    private ClassPlace classPlace;
    private EtatReservation etatReservation;
    @ManyToOne
    private Voyageur voyageur;
    @ManyToOne
    private Vol vols;

}
