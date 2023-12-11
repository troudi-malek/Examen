package com.example.malektroudiexblanc.service;

import com.example.malektroudiexblanc.entities.ClassPlace;
import com.example.malektroudiexblanc.entities.Reservation;
import com.example.malektroudiexblanc.entities.Vol;
import com.example.malektroudiexblanc.entities.Voyageur;
import com.example.malektroudiexblanc.repositories.AeroportRepo;
import com.example.malektroudiexblanc.repositories.ReservationRepo;
import com.example.malektroudiexblanc.repositories.VolRepo;
import com.example.malektroudiexblanc.repositories.VoyageurRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public  class ExamenService implements IExamenService {
    @Autowired
    AeroportRepo aeroportRepo;
    @Autowired
    VolRepo volRepo;
    @Autowired
    VoyageurRepo voyageurRepo;
    @Autowired
    ReservationRepo reservationRepo;
    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        if(vol.getAeroport().getCodeAITA().equals(vol.getAeroport2().getCodeAITA())){
            return "verifier les aeroports saisis !";
        }else {
            volRepo.save(vol);
            return "le vol est ajouté avec succes !";
        }
    }

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        for (Voyageur voyageur :voyageurs) {
            voyageurRepo.save(voyageur);

        }
        return null;

    }

    @Override
    public Reservation confirmerReservation(String resId) {
        List<Reservation> reservations=reservationRepo.findAll();
        for (Reservation reservation:reservations){
            if(reservation.getIdReservation().equals(resId)){
                return reservation;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, List<Voyageur>> getVoyageurByVol() {
        List<Voyageur> voyageurs=voyageurRepo.findAll();
        for (Voyageur voyageur:voyageurs){
           Set<Reservation> reservations= voyageur.getReservations();
           for(Reservation reservation:reservations){
               if(confirmerReservation(reservation.getIdReservation()) != null){
                   return (Map<Integer, List<Voyageur>>) voyageur;
               }
           }
        }
        return null;
    }

    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        return null;
    }

}
