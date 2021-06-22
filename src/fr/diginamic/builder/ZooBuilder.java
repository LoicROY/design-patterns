package fr.diginamic.builder;

import java.util.Optional;

public class ZooBuilder {

    private final Zoo ZOO;

    public ZooBuilder(String zooName) {
        ZOO = new Zoo(zooName);
    }

    public ZooBuilder appendZone(String zoneName, Integer capacite){
        if (ZOO.getZones().stream().anyMatch(o -> o.getNom().equalsIgnoreCase(zoneName))){
            return this;
        }

        ZOO.getZones().add(new Zone(zoneName, capacite));
        return this;
    }

    public ZooBuilder appendAnimal(String zoneName, Animal animal) throws Exception {
        if (animal == null || zoneName.isBlank()){
            return this;
        }

        Optional<Zone> zoneOptional = ZOO.getZones().stream().filter(o -> o.getNom().equalsIgnoreCase(zoneName)).findFirst();
        if (zoneOptional.isEmpty()){
            return this;
        }
        
        Zone zone = zoneOptional.get();
        if (zone.getAnimals().size() >= zone.getCapacite()){
            throw new Exception("La zone ne peut plus accueillir de nouveaux animaux");
        }
        zone.getAnimals().add(animal);
        return this;
    }

    public Zoo get() {
        return ZOO;
    }
}
