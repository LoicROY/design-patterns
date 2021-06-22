package fr.diginamic.composite;

public class Employe implements IElement {

    private String nom;
    private String prenom;
    private double salaire;

    public Employe(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom.toUpperCase();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return (double) Math.round(salaire * 100)/100;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + getSalaire() +
                '}';
    }

    @Override
    public double calculerSalaire() {
        return getSalaire();
    }
}
