package Plants;

import Enums.Nourishment;
import Enums.Type;
import Interfaces.PlantInterface;

public class Cactus extends Plant implements PlantInterface {
    public Cactus(String name, float height) {
        super(Type.Cactus, name, height);
    }

    @Override
    public String calculateNourishment() {
        return "2 centilitres of " + Nourishment.MineralWater.nourishment;
    }
}
