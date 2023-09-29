import Interfaces.PlantInterface;
import Plants.Cactus;
import Plants.CarnivorousPlant;
import Plants.Palm;
import Plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final String name;
    private final List<Plant> plantList;
    private final List<Palm> palmList;
    private final List<CarnivorousPlant> carnivorousPlantList;
    private final List<Cactus> cactusList;

    public Hotel(String name) {
        this.name = name;
        this.plantList = new ArrayList<>();
        this.palmList = new ArrayList<>();
        this.carnivorousPlantList = new ArrayList<>();
        this.cactusList = new ArrayList<>();
    }

    public void addToList(Plant plant) {
        this.plantList.add(plant);
    }

    public List<Plant> getList(){
        return this.plantList;
    }
    public Plant getPlantFromList(String name){
        for (Plant plant : plantList) {
            if(plant.getName().equalsIgnoreCase(name)) return plant;
        }
        return null;
    }
}
