package fr.diginamic.builder;

import java.util.Optional;

public class ZooBuilder {

    private Zoo zoo;

    public ZooBuilder(String zooName) {
        zoo = new Zoo(zooName);
    }

    public ZooBuilder appendZone(String zoneName, Integer capacite){
        if (zoo.getZones().stream().anyMatch(o -> o.getNom().equalsIgnoreCase(zoneName))){
            return this;
        }

        zoo.getZones().add(new Zone(zoneName, capacite));
        return this;
    }

    public ZooBuilder appendAnimal(String zoneName, Animal animal) throws Exception {

        if (animal == null || zoneName.isBlank()){
            return this;
        }

        Optional<Zone> zone = zoo.getZones().stream().filter(o -> o.getNom().equalsIgnoreCase(zoneName)).findFirst();
        if (zone.isEmpty()){
            return this;
        }
        if (zone.get().getAnimals().size() >= zone.get().getCapacite()){
            throw new Exception("La zone ne peut plus accueillir de nouveaux animaux");
        }
        zone.get().getAnimals().add(animal);
        return this;
    }

    public Zoo get() {
        return zoo;
    }
}
