package com.example.malektroudiexblanc.controller;

import com.example.malektroudiexblanc.entities.Reservation;
import com.example.malektroudiexblanc.entities.Vol;
import com.example.malektroudiexblanc.entities.Voyageur;
import com.example.malektroudiexblanc.service.ExamenService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class ExamenRestController {
    @Autowired
    ExamenService examenService;

    @PostMapping("ajouteVolEtAeroport")
    String ajouterVolEtAeroport(@RequestBody Vol v){
       return examenService.ajouterVolEtAeroport(v);
    }
    @PostMapping("ajouterVoyageurs")
    List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur>voyageurs){
        return examenService.ajouterVoyageurs(voyageurs);
    }
    @GetMapping("confirmerReservation/{id}")
    Reservation confirmerReservation(@PathVariable("id") String resid){
        return examenService.confirmerReservation(resid);
    }
    @GetMapping("getVoyageurByVol")
    public Map<Integer, List<Voyageur>> getVoyageurByVol(){
        return examenService.getVoyageurByVol();

    }
}
