package fr.diginamic.strategy;

public class Tri {

    public void exec(StrategySortType strategySortType, Integer[] array) {
        StrategySortFactory.getInstance(strategySortType).trier(array);
    }
}