package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

    private String nom;
    private List<IElement> elements;

    {
        elements = new ArrayList<>();
    }

    public Service(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nom='" + nom + '\'' +
                ", elements=" + elements +
                '}';
    }

    @Override
    public double calculerSalaire() {
        return elements.stream().mapToDouble(IElement::calculerSalaire).sum();
    }
}
