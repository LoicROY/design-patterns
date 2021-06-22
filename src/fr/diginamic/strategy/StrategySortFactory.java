package fr.diginamic.strategy;

public class StrategySortFactory {

    public static Strategy getInstance(StrategySortType strategySortType){
        try {
            return strategySortType.getClassType().getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
