package com.example.malektroudiexblanc.repositories;

import com.example.malektroudiexblanc.entities.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface VolRepo extends JpaRepository<Vol,Integer> {

}
