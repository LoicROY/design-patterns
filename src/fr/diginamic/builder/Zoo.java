package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Zone> zones;

    {
        this.zones = new ArrayList<>();
    }

    public Zoo(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "nom='" + nom + '\'' +
                ", zones=" + zones +
                '}';
    }
}
