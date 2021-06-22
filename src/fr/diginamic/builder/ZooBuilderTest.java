package fr.diginamic.builder;

public class ZooBuilderTest {
    public static void main(String[] args) {
        ZooBuilder zooBuilder = new ZooBuilder("zoo 1");
        zooBuilder
                .appendZone("zone 1", 3)
                .appendZone("zone 1", 3)
                .appendZone("zone 2", 3);

        try {
            zooBuilder
                    .appendAnimal("zone 1", new Animal("animal 1"))
                    .appendAnimal("zone 1", new Animal("animal 2"))
                    .appendAnimal("zone 1", new Animal("animal 3"));


            zooBuilder
                    .appendAnimal("zone 2", new Animal("animal 4"))
                    .appendAnimal("zone 2", new Animal("animal 5"))
                    .appendAnimal("zone 2", new Animal("animal 6"));

            zooBuilder
                    .appendAnimal("zone 3", new Animal("animal 7"));
            zooBuilder
                    .appendAnimal("zone 3", null)
                    .appendAnimal(null, new Animal("animal 8"));

            System.out.println(zooBuilder.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
