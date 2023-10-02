import Plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Plant> plantList;

    public Hotel() {
        plantList = new ArrayList<>();
    }

    public void addToList(Plant plant) {
        plantList.add(plant);
    }

    public Plant getPlantFromList(String name){
        for (Plant plant : plantList) {
            if(plant.getName().equalsIgnoreCase(name)) return plant;
        }
        return null;
    }
}
