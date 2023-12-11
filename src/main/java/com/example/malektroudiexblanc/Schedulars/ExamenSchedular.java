package com.example.malektroudiexblanc.Schedulars;

import com.example.malektroudiexblanc.service.ExamenService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class ExamenSchedular {
    @Autowired
    ExamenService examenService;
    @Scheduled(fixedRate = 60000)
    void annulerReservation(){
        log.info("Reservation annulé");
    }
}
