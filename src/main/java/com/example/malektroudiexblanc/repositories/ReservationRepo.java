package com.example.malektroudiexblanc.repositories;

import com.example.malektroudiexblanc.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,String> {
}
