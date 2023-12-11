package com.example.malektroudiexblanc.service;

import com.example.malektroudiexblanc.entities.ClassPlace;
import com.example.malektroudiexblanc.entities.Reservation;
import com.example.malektroudiexblanc.entities.Vol;
import com.example.malektroudiexblanc.entities.Voyageur;

import java.util.List;
import java.util.Map;

public interface IExamenService {
    String ajouterVolEtAeroport(Vol vol);
    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);
    Reservation confirmerReservation(String resId);
    Map<Integer,List<Voyageur>> getVoyageurByVol();
    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);
}
