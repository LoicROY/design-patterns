package fr.diginamic.factory;

public class Tablette extends ObjetConnecte {

    public Tablette(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public String toString() {
        return "Tablette{" +
                "limiteVolts=" + limiteVolts +
                '}';
    }
}
