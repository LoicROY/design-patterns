package fr.diginamic.factory;

public class ObjetConnecteFactory {

    public static ObjetConnecte getInstance(ObjetConnecteType type, Integer limiteVolts) {
        try {
            return type.getClassType().getConstructor(new Class[] {Integer.class}).newInstance(limiteVolts);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
