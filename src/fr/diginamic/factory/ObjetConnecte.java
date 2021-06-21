package fr.diginamic.factory;

public class ObjetConnecte {

    protected Integer limiteVolts;

    public ObjetConnecte(Integer limiteVolts) {
        this.limiteVolts = limiteVolts;
    }

    public Integer getLimiteVolts() {
        return limiteVolts;
    }

    public void setLimiteVolts(Integer limiteVolts) {
        this.limiteVolts = limiteVolts;
    }

    @Override
    public String toString() {
        return "ObjetConnecte{" +
                "limiteVolts=" + limiteVolts +
                '}';
    }
}
