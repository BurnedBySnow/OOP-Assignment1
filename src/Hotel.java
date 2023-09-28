import Plants.Cactus;
import Plants.CarnivorousPlant;
import Plants.Palm;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Palm> palmList;
    private List<CarnivorousPlant> carnivorousPlantList;
    private  List<Cactus> cactusList;

    public Hotel(String name) {
        this.name = name;
        this.palmList = new ArrayList<>();
        this.carnivorousPlantList = new ArrayList<>();
        this.cactusList = new ArrayList<>();
    }

    public void addToPalmList(Palm palm) {
        this.palmList.add(palm);
    }
    public void addToCarnivorousPlantList(CarnivorousPlant carnivorousPlant) {
        this.carnivorousPlantList.add(carnivorousPlant);
    }
    public void addToCactusList(Cactus cactus) {
        this.cactusList.add(cactus);
    }
}
