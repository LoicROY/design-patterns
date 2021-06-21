package fr.diginamic.factory;

public class EnceinteConnecte extends ObjetConnecte {

    public EnceinteConnecte(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public String toString() {
        return "EnceinteConnecte{" +
                "limiteVolts=" + limiteVolts +
                '}';
    }
}
