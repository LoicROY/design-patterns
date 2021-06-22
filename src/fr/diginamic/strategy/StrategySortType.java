package fr.diginamic.strategy;

public enum StrategySortType {
    BUBBLE_SORT(BubbleSortStrategy.class),
    INSERTION_SORT(InsertionSortStrategy.class),
    SELECTION_SORT(SelectionSortStrategy.class);

    private final Class<? extends Strategy> CLASS;

    StrategySortType(Class<? extends Strategy> selectionSortStrategyClass) {
        CLASS = selectionSortStrategyClass;
    }

    public Class<? extends Strategy> getClassType(){
        return CLASS;
    }
}
