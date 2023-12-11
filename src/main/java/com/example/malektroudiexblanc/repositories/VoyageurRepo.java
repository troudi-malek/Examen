package com.example.malektroudiexblanc.repositories;

import com.example.malektroudiexblanc.entities.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoyageurRepo extends JpaRepository<Voyageur,Integer> {
}
