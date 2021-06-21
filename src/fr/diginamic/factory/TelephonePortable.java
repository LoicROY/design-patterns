package fr.diginamic.factory;

public class TelephonePortable extends ObjetConnecte {

    public TelephonePortable(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public String toString() {
        return "TelephonePortable{" +
                "limiteVolts=" + limiteVolts +
                '}';
    }
}
